package szpor.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szpor.api.repository.StoreRepository;
import szpor.api.model.Store;

import java.util.Optional;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public Optional<Store> getStoreById(long id) {
        return Optional.empty();
    }

    public String saveStore(Store store) {
        Integer nip = store.getNIP();
            Boolean storeExistsByNIP = storeRepository.existsByNIP(nip);
            System.out.println(storeExistsByNIP);


                try {
                    Store zmienna = storeRepository.saveAndFlush(store);
                } catch (Exception e) {

                    System.out.println(e.getMessage());
                    return e.getMessage();
                }


        return null;
    }
}
