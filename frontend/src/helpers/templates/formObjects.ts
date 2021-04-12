import { formEnum } from "../interfaces/formInterfaces";
import { addressEntity, storeEntity } from "../interfaces/formInterfaces";

export class formObjects {
  public static formTemplates(choose: formEnum) {
    switch (choose) {
      case formEnum.ADDRESS_FORM: {
        const storeInterface: storeEntity = {
          storeName: "",
          storeAddress: {
            addressCountry: "",
          },
          storeNIP: 0,
        };
        return storeInterface;
      }

      case formEnum.STORE_FORM: {
        const addressInterface: addressEntity = {
          addressCountry: "",
        };
        return addressInterface;
      }
      default: {
        //statements;
        break;
      }
    }
  }
}
