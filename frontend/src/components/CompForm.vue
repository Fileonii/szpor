<template>
  <div>
    <div class="pa-md-4 mx-lg-auto">
      <div v-for="control in getFormElement.controls" :key="control.key">
        <v-text-field
          :ref="control.ref"
          :label="control.caption"
        ></v-text-field>
      </div>
    </div>
    <v-btn @click="saveStore">ZAPISZ</v-btn>
  </div>
</template>

<script lang="ts">
import Vue from "vue";
import { formEnum } from "../helpers/interfaces/formInterfaces";
import { formElements } from "../helpers/templates/formElements";
import { BackendConnector } from "../helpers/connectors/backendConnector";
import Vuetify from "vuetify/lib";

export default Vue.component("comp-form", {
  data(): any {
    return {
      formEnum: formEnum,
      formElements: formElements,
    };
  },

  computed: {
    getFormType(): any {
      return this.$store.getters.getFormType;
    },

    getFormElement(): any {
      return formElements[this.getFormType] || {};
    },
  },

  methods: {
    saveStore() {
      this.$nextTick(() => {
        const formElements = this.getFormElement;
        const formElementsControls = formElements.controls;

        let saveData: { [key: string]: any } = {};

        formElementsControls.map((control: any) => {
          console.log(control.ref);
          console.log(this.$refs[control.ref][0]);
          const value = this.$refs[control.ref][0].lazyValue;
          const dbColumn = control.dbColumn;
          console.log(value);
          saveData[dbColumn] = value;
        });
        console.log(this.getFormElement);
        BackendConnector.postFormByType(formElements.type, saveData);
        console.log(saveData);
      });
    },
  },
});
</script>

<style></style>
