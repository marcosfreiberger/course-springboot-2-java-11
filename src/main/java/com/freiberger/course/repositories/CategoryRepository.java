package com.freiberger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freiberger.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
