package szpor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import szpor.api.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
