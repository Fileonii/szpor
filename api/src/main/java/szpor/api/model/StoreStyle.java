package szpor.api.model;

import javax.persistence.*;

@Entity
@Table(name = "StoreStyle")
public class StoreStyle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ssId;
    @ManyToOne
    private Style storeId;
    @ManyToOne
    private Style styleId;

    public Long getSsId() {
        return ssId;
    }

    public Style getStoreId() {
        return storeId;
    }

    public Style getStyleId() {
        return styleId;
    }

    public void setSsId(Long ssId) {
        this.ssId = ssId;
    }

    public void setStoreId(Style storeId) {
        this.storeId = storeId;
    }

    public void setStyleId(Style styleId) {
        this.styleId = styleId;
    }
}
