package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Address;
import com.geekster.MappingPractice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    //creating address
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    //read address
    @GetMapping("address")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    //read address id
    @GetMapping("address/{id}")
    public Address getAddressById(@PathVariable String id){
        return addressService.getAddressById(id);
    }

    //update address
    @PutMapping("address/{id}")
    public String updateAddress(@PathVariable String id,@RequestBody Address address){
        return addressService.updateAddress(id,address);
    }

    //delete address
    @DeleteMapping("address/{id}")
    public String deleteAddress(@PathVariable String id){
        return addressService.deleteAddress(id);
    }




}
