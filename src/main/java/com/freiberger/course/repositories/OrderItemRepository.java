package com.freiberger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freiberger.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
