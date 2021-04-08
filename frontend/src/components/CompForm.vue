<template>
  <!-- <div v-if="formType === 1">
    <button v-on:click="count++">New Address</button>
  </div>
  <div v-else-if="formType === 2">
    <button>New Store</button>
  </div> -->
  <div>
    <div v-if="getFormType === formUtils.ADDRESS_FORM">
      {{ getFormType }}
    </div>
    <div v-if="getFormType === formUtils.STORE_FORM">
      {{ getFormType }}
    </div>
    <button @click="createForm" />
  </div>
</template>

<script lang="ts">
import Vue from "vue";
import { formUtils } from "../helpers/interfaces/formEnum";
import { formElements } from "../helpers/templates/formElements";
export default Vue.component("comp-form", {
  data: function() {
    return {
      formUtils: formUtils,
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
      const formTypes = this.getFormType;
      const formTemplate = formElements.forms;
      console.log(formTemplate);
    },
  },
});
</script>

<style></style>
