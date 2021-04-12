<template>
  <!-- <div v-if="formType === 1">
    <button v-on:click="count++">New Address</button>
  </div>
  <div v-else-if="formType === 2">
    <button>New Store</button>
  </div> -->
  <div>
    <div class="pa-md-4 mx-lg-auto" v-for="form in formItems" :key="form.name">
      <div v-if="getFormType === form.type">
        <div v-for="control in form.controls" :key="control.key">
          <v-text-field
            :label="control.caption"
            :rules="rules"
            hide-details="auto"
          ></v-text-field>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from "vue";
import { formEnum } from "../helpers/interfaces/formInterfaces";
import { formElements } from "../helpers/templates/formElements";
import Vuetify from "vuetify/lib";
const formItems = formElements.forms;
export default Vue.component("comp-form", {
  data: function() {
    return {
      formUtils: formEnum,
      formItems: formItems,
    };
  },

  template: "",

  computed: {
    getFormType() {
      console.log();
      const getterVuex: formEnum = this.$store.getters.getFormType;
      return getterVuex;
    },
  },

  methods: {
    createForm() {
      for (let i: number = 0; i < formItems.length; i++) {
        console.log(formItems[i].name);
        if (formItems[i].type === this.getFormType) {
          console.log("Mam formularz");
          console.log(formItems[i]);
        }
      }
    },
  },
});
</script>

<style></style>
