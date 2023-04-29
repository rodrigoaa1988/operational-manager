package com.xmsystem.operationalmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xmsystem.operationalmanager.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
