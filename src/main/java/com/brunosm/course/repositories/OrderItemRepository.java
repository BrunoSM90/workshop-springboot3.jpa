package com.brunosm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunosm.course.entities.OrderItem;
import com.brunosm.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
