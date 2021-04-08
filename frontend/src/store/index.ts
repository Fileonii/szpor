import Vue from "vue";
import Vuex from "vuex";
import { Commit } from "vuex";
// import storeEntity from "../helpers/interfaces/storeInterface";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    formType: String,
  },

  mutations: {
    setFormType: (state, payloads) => {
      state.formType = payloads;
      console.log(`${payloads} mutacja`);
    },
  },

  getters: {
    getFormType: (state) => {
      return state.formType;
    },
  },

  actions: {
    actionFormType: ({ commit }: { commit: Commit }, payloads) => {
      commit("setFormType", payloads);
    },
  },

  modules: {},
});
