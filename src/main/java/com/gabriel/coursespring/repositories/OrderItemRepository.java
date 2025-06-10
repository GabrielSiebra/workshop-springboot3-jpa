package com.gabriel.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.coursespring.entities.OrderItem;
import com.gabriel.coursespring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
