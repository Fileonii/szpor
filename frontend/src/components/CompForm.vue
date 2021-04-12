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
    <v-btn @click="saveStore">Dodaj Sklep</v-btn>
  </div>

</template>

<script lang="ts">
import Vue from "vue";
import {formEnum} from "../helpers/interfaces/formInterfaces";
import {formElements} from "../helpers/templates/formElements";
import Vuetify from "vuetify/lib";

export default Vue.component("comp-form", {
  data: function () {
    return {
      formUtils: formEnum,
      formElements: formElements,
    };
  },


  computed: {
    getFormType() {
      const getterVuex: formEnum = this.$store.getters.getFormType;
      return getterVuex;
    },

    getFormElement(){
      return this.formElements[this.getFormType];
    }
  },

  methods: {
    saveStore(){
      this.$nextTick(() => {
        const variable = this.$refs['str_1'];
        //console.log(variable);
      });

    }
    // createForm() {
    //   for (let i: number = 0; i < formItems.length; i++) {
    //     console.log(formItems[i].name);
    //     if (formItems[i].type === this.getFormType) {
    //       console.log("Mam formularz");
    //       console.log(formItems[i]);
    //     }
    //   }
    // },
  },
});
</script>

<style></style>
