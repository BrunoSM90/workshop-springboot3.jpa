package com.brunosm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunosm.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
