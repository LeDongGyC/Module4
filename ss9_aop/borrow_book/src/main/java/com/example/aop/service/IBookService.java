package com.example.aop.service;

import com.example.aop.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {
    Page<Book> findAll(Pageable pageable);
    void save(Book book);
    Book findById(Integer id);
}
