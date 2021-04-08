export const formElements = {
  forms: [
    {
      type: "STORE_FORM",
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
      type: "ADDRESS_FORM",
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
