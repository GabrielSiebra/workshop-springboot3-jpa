package com.gabriel.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
