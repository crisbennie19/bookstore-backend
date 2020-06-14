package com.starkmark.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.starkmark.bookstore.entity.BookCategory;
@CrossOrigin("http://localhost:4200")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
