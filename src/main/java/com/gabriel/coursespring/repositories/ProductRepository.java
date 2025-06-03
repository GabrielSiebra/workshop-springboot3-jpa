package com.gabriel.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.coursespring.entities.Product ;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
