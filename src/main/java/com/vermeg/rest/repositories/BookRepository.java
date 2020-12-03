package com.vermeg.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.vermeg.rest.entities.Book;


public interface BookRepository extends CrudRepository<Book, Long>{

}
