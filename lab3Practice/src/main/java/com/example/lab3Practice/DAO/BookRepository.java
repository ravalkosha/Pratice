package com.example.lab3Practice.DAO;

import com.example.lab3Practice.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
