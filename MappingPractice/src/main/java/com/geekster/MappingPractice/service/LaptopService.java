package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Laptop;
import com.geekster.MappingPractice.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return "new laptop added successfully!!";
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public Laptop getLaptopById(String id) {
        return laptopRepo.findById(id).get();
    }

    public String updateLaptop(Laptop laptop, String id) {
        laptopRepo.save(laptop);
        return "new laptop added into list successfully!!";
    }

    public String deleteLaptop(Laptop laptop, String id) {
        laptopRepo.deleteById(id);
        return "laptop added successfully!!";
    }
}
