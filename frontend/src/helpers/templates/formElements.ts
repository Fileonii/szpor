import { formEnum } from "../interfaces/formInterfaces";

export const formElements = {
  forms: [
    {
      type: `${formEnum.STORE_FORM}`,
      name: "Nowy Sklep",
      controls: [
        {
          type: "TEXT",
          caption: "Nazwa Sklepu",
          key: "str_1",
        },
        {
          type: "TEXT",
          caption: "NIP",
          key: "str_2",
        },
      ],
    },

    {
      type: `${formEnum.ADDRESS_FORM}`,
      name: "Formularz Adresowy",
      controls: [
        {
          type: "TEXT",
          caption: "Kraj",
          key: "add_1",
        },
      ],
    },
  ],
};
