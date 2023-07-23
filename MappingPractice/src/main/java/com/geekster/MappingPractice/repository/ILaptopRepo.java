package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,String> {
}
