package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Address;
import com.geekster.MappingPractice.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "new address added!!";
    }

    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public Address getAddressById(String id) {
        return addressRepo.findById(Long.valueOf(id)).get();
    }

    public String updateAddress(String id, Address address) {
        addressRepo.save(address);
        return "address updated successfully!!";
    }

    public String deleteAddress(String id) {
        addressRepo.deleteById(Long.valueOf(id));
        return  "address deleted successfully!!";
    }
}
