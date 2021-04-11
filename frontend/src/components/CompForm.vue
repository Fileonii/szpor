<template>
  <!-- <div v-if="formType === 1">
    <button v-on:click="count++">New Address</button>
  </div>
  <div v-else-if="formType === 2">
    <button>New Store</button>
  </div> -->
  <div>
    <div v-for="form in formItems" :key="form.name">
      <div v-if="getFormType === form.type">
        {{ getFormType }}
        <v-text-field
          label="Main input"
          :rules="rules"
          hide-details="auto"
        ></v-text-field>
      </div>
    </div>

    <!-- <div v-if="getFormType === formUtils.STORE_FORM">
      {{ getFormType }}
    </div> -->
    <button @click="createForm" />
  </div>
</template>

<script lang="ts">
import Vue from "vue";
import { formUtils } from "../helpers/interfaces/formInterfaces";
import { formElements } from "../helpers/templates/formElements";

const formItems = formElements.forms;
export default Vue.component("comp-form", {
  data: function() {
    return {
      formUtils: formUtils,
      formItems: formItems,
    };
  },

  template: "",

  computed: {
    getFormType() {
      console.log();
      const getterVuex: formUtils = this.$store.getters.getFormType;
      return getterVuex;
    },
  },

  methods: {
    createForm() {
      const formTypeVuex = this.getFormType;
      const formTemplate = formElements.forms;

      for (let i: number = 0; i < formTemplate.length; i++) {
        console.log(formTemplate[i].name);
        if (formTemplate[i].type === formTypeVuex) {
          console.log("Mam formularz");
          console.log(formTemplate[i]);
        }
      }

      // switch (formTypes) {
      //   case formUtils.ADDRESS_FORM: {
      //     console.log(formTemplate);
      //     break;
      //   }

      //   case formUtils.STORE_FORM: {
      //     console.log("STORE! w case");
      //     break;
      //   }
      //   default: {
      //     //statements;
      //     break;
      //   }
      // }
    },
  },
});
</script>

<style></style>
