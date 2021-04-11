import { formUtils } from "../interfaces/formInterfaces";
import { addressEntity, storeEntity } from "../interfaces/formInterfaces";

export class formObjects {
  public static formTemplates(choose: formUtils) {
    switch (choose) {
      case formUtils.ADDRESS_FORM: {
        const storeInterface: storeEntity = {
          storeName: "",
          storeAddress: {
            addressCountry: "",
          },
          storeNIP: 0,
        };
        return storeInterface;
      }

      case formUtils.STORE_FORM: {
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
