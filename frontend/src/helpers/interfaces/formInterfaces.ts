export interface addressEntity {
  addressCountry: string;
  //   addressCity: string;
  //   addressStreet: string;
  //   addressNumBuilding: number;
  //   addressNumApartment: number | null;
  //   addressZipCode: number | string;
  //   adressIsDeleted: boolean;
  //   addressIsExpired: boolean;
}

export interface storeEntity {
  storeName: string;
  storeAddress: addressEntity;
  storeNIP: number;
}
