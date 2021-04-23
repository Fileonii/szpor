import axios from "axios";
import { formEnum } from "../interfaces/formInterfaces";

export class BackendConnector {
  public static postFormByType(formType: string, saveData: object) {
    switch (formType) {
      case formEnum.STORE_FORM: {
        console.log("Wysylasz zapytanie store");
        console.log(saveData);
        axios.post("http://localhost:5000/api/store/save", saveData);
        break;
      }
      case formEnum.ADDRESS_FORM: {
        console.log("Wysylasz zapytanie address");
        console.log(saveData);
        break;
      }
      default: {
        //statements;
        break;
      }
    }
  }
}
