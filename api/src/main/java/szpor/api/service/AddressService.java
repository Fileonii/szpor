package szpor.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szpor.api.model.Address;
import szpor.api.model.Store;
import szpor.api.repository.AddressRepository;
import szpor.api.repository.StoreRepository;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Optional<Address> getAddressById(long id) {
        return Optional.empty();
    }

    public String saveAddress(Address address) {

        try {
            addressRepository.saveAndFlush(address);
        } catch (Exception e) {
            return e.getMessage();
        }

        return null;
    }
}
