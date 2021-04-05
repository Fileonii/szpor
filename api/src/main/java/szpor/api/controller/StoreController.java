package szpor.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import szpor.api.repository.StoreRepository;
import szpor.api.model.Store;
import szpor.api.service.StoreService;

@RestController
@RequestMapping(value = "/api/store")
public class StoreController {


    protected StoreService storeService;
    protected StoreRepository storeRepository;

    //protected Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Autowired
    public StoreController(StoreService storeService, StoreRepository storeRepository) {
        this.storeService = storeService;
        this.storeRepository = storeRepository;
    }


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<Store> getStoreById(@PathVariable("id") final long id){

        Store store = storeRepository.findById((id));

        if(store == null){
            return null;
        }

        return new ResponseEntity<Store> (store, HttpStatus.OK);
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST,consumes = "application/json")
    public ResponseEntity<?> saveStore(@RequestBody Store storeBody){

        Store store = new Store(storeBody.getStoreName());
        String error = storeService.saveStore(store);

        if(error == null){
            return new ResponseEntity<Store> (store, HttpStatus.OK);
        }else{
            return new ResponseEntity<String> (error, HttpStatus.BAD_REQUEST);
        }
    }
}
