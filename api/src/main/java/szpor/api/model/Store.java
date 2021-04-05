package szpor.api.model;


import szpor.api.utils.Utils;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Store")
public class Store implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    private String storeName;

    private String storeHash;

    public Store() {
    }

    public Store(String storeName) {

        this.storeName = storeName;
        this.storeHash = Utils.endoceString(10, storeName);
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreHash() {
        return storeHash;
    }

    public void setStoreHash(String storeHash) {
        this.storeHash = storeHash;
    }
}
