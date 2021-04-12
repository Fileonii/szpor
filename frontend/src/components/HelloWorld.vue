<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <comp-form />
    <v-btn
      depressed
      color="primary"
      @click="chooseFormType(formUtils.ADDRESS_FORM)"
    >
      Dodaj Adres
    </v-btn>
    <v-btn @click="chooseFormType(formUtils.STORE_FORM)">Dodaj Sklep</v-btn>
  </div>
</template>

<script lang="ts">
import { addressEntity } from "../helpers/interfaces/formInterfaces";
import Vue from "vue";
import { storeEntity } from "../helpers/interfaces/formInterfaces";
import { keys } from "ts-transformer-keys";
import CompForm from "./CompForm.vue";
import { formEnum } from "../helpers/interfaces/formInterfaces";
const address: addressEntity = {
  addressCountry: "Pologne",
};

const shop: storeEntity = {
  storeName: "xd",
  storeAddress: address,
  storeNIP: 12,
};

export default Vue.extend({
  components: { CompForm },
  name: "HelloWorld",
  props: {
    msg: String,
  },
  data: function() {
    return {
      formUtils: formEnum,
    };
  },
  methods: {
    chooseFormType(choose: formEnum) {
      console.log(choose);
      //dispatch odnosi sie do akcji
      this.$store.dispatch("actionFormType", choose);
    },
  },
});
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
