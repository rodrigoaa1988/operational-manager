package com.xmsystem.operationalmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xmsystem.operationalmanager.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
