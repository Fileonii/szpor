package szpor.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import szpor.api.model.Address;
import szpor.api.repository.AddressRepository;
import szpor.api.repository.StoreRepository;
import szpor.api.model.Store;
import szpor.api.service.AddressService;
import szpor.api.service.StoreService;

@RestController
@RequestMapping(value = "/api/store")
public class StoreController {


    protected StoreService storeService;
    protected StoreRepository storeRepository;
    protected AddressService addressService;
    protected AddressRepository addressRepository;

    @Autowired
    public StoreController(StoreService storeService, StoreRepository storeRepository, AddressService addressService, AddressRepository addressRepository) {
        this.storeService = storeService;
        this.storeRepository = storeRepository;
        this.addressService = addressService;
        this.addressRepository = addressRepository;
    }
//protected Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<Store> getStoreById(@PathVariable("id") final long id){

        Store store = storeRepository.findById((id));

        if(store == null){
            return null;
        }

        return new ResponseEntity<Store> (store, HttpStatus.OK);
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST,consumes = "application/json")
    public ResponseEntity<?> saveStore(@RequestBody Address addressBody){
        String storeName = addressBody.getStore().getStoreName();

        Store store = new Store(storeName);
        storeService.saveStore(store);

        addressBody.setStore(store);

//        Store store = new Store(storeBody.getStoreName());
        String error = addressService.saveAddress(addressBody);

        if(error == null){
            return new ResponseEntity<Address> (addressBody, HttpStatus.OK);
        }else{
            return new ResponseEntity<String> (error, HttpStatus.BAD_REQUEST);
        }
    }
}
