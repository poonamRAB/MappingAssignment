package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,String> {
}
