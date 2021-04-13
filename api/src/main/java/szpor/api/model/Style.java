package szpor.api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Style")
public class Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StyleId;

    private String StyleName;

    @OneToMany(mappedBy = "storeId", cascade = CascadeType.ALL)
    private Set<StoreStyle> storeStyleSet;

    @OneToMany(mappedBy = "styleId", cascade = CascadeType.ALL)
    private Set<StoreStyle> storeStyleSet1;

    public Long getStyleId() {
        return StyleId;
    }

    public void setStyleId(Long styleId) {
        StyleId = styleId;
    }

    public String getStyleName() {
        return StyleName;
    }

    public void setStyleName(String styleName) {
        StyleName = styleName;
    }

    public Set<StoreStyle> getStoreStyleSet() {
        return storeStyleSet;
    }

    public void setStoreStyleSet(Set<StoreStyle> storeStyleSet) {
        this.storeStyleSet = storeStyleSet;
    }

    public Set<StoreStyle> getStoreStyleSet1() {
        return storeStyleSet1;
    }

    public void setStoreStyleSet1(Set<StoreStyle> storeStyleSet1) {
        this.storeStyleSet1 = storeStyleSet1;
    }
}
