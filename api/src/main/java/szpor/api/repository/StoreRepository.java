package szpor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import szpor.api.model.Store;

import java.util.List;


@Component
public interface StoreRepository extends JpaRepository<Store, Long> {

    List<Store> findAll();
    Store findById(long id);

    boolean existsByNIP(Integer nip);
}
