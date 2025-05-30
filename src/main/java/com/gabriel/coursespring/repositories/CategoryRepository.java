package com.gabriel.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
