package com.freiberger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freiberger.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
