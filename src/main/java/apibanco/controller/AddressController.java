package apibanco.controller;

import apibanco.model.Address;
import apibanco.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;
    @GetMapping("{username}/address/find")
    public ResponseEntity<Address> findAddress(@PathVariable("username") String username){
        return ResponseEntity.status(HttpStatus.OK).body(addressService.findAddress(username));
    }

    @PostMapping("{username}/address/save")
    public ResponseEntity<Void> saveAddress(@PathVariable("username") String username, @RequestBody Address address) {
        addressService.save(username, address);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PutMapping("{username}/address/update")
    public ResponseEntity<Void> updateAddress(@PathVariable("username") String username, @RequestBody Address address) {
        addressService.update(username, address);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
