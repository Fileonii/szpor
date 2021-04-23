import { formEnum } from "../interfaces/formInterfaces";

export const formElements = {
  [formEnum.STORE_FORM]: {
    type: formEnum.STORE_FORM,
    name: "Nowy Sklep",
    controls: [
      {
        type: "TEXT",
        caption: "Nazwa Sklepu",
        ref: "str_1",
        dbColumn: "storeName",
      },
      {
        type: "TEXT",
        caption: "NIP",
        ref: "str_2",
        dbColumn: "nip",
      },
    ],
  },

  [formEnum.ADDRESS_FORM]: {
    type: formEnum.ADDRESS_FORM,
    name: "Formularz Adresowy",
    controls: [
      {
        type: "TEXT",
        caption: "Kraj",
        ref: "add_1",
        dbColumn: "country",
      },
    ],
  },

  [formEnum.NOWY_FORMULARZ]: {
    type: formEnum.NOWY_FORMULARZ,
    name: "Formularz Dupy",
    controls: [
      {
        type: "TEXT",
        caption: "Podaj rozmiar dupy",
        ref: "dup_1",
        dbColumn: "dupa",
      },
    ],
  },
};
