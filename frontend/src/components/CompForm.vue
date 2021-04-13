<template>

  <div>
    <div class="pa-md-4 mx-lg-auto">
      <div v-for="control in getFormElement.controls" :key="control.key">
        <v-text-field
            :ref="control.ref"
            :label="control.caption"
            :value="123"
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
  data(): any {
    return {
      formEnum: formEnum,
      formElements: formElements,
    };
  },


  computed: {
    getFormType(): any{
      return this.$store.getters.getFormType;
    },

    getFormElement(): any{
      return formElements[this.getFormType] || {};
    }
  },

  methods: {
    saveStore(){
      this.$nextTick(() => {

        const formElementsControls = this.getFormElement.controls;

        let saveData: {[k: string]: any} = {};

        formElementsControls.map((control: any) => {
          const value = this.$refs[control.ref][0].value;
          const dbColumn = control.dbColumn;

          saveData[dbColumn] = value;
        })

        console.log(saveData);

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
