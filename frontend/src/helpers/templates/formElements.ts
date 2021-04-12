import { formEnum } from "../interfaces/formInterfaces";

export const formElements = {
  [formEnum.STORE_FORM]: {
    type: [formEnum.STORE_FORM],
    name: "Nowy Sklep",
    controls: [
      {
        type: "TEXT",
        caption: "Nazwa Sklepu",
        ref: "str_1",
        dbColumn: 'storeName',
      },
      {
        type: "TEXT",
        caption: "NIP",
        ref: "str_2",
        dbColumn: 'nip',
      },
    ],
  },

  [formEnum.ADDRESS_FORM]: {
    type: [formEnum.STORE_FORM],
    name: "Formularz Adresowy",
    controls: [
      {
        type: "TEXT",
        caption: "Kraj",
        key: "add_1",
      },
    ],
  },
};
