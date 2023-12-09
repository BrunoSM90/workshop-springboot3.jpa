package com.brunosm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunosm.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
