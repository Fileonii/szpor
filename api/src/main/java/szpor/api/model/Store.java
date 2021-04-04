package szpor.api.model;


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

    public Store() { }//JPA constructor

    public Store(String storeName) {

        this.storeName = storeName;
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
}
