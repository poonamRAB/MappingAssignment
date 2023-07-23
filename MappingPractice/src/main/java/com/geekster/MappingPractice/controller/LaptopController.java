package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Laptop;
import com.geekster.MappingPractice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }

    @GetMapping("laptop")
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }

    @GetMapping("laptop/{id}")
    public Laptop getLaptopById( @PathVariable String id){
        return laptopService.getLaptopById(id);
    }

    @PutMapping("laptop/{id}")
    public String updateLaptop(@RequestBody Laptop laptop, @PathVariable String id){
        return laptopService.updateLaptop(laptop,id);
    }

    @DeleteMapping("laptop/{id}")
    public String deleteLaptop(@RequestBody Laptop laptop,@PathVariable String id){
        return laptopService.deleteLaptop(laptop,id);
    }

}
