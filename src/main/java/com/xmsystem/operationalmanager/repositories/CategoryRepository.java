package com.xmsystem.operationalmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xmsystem.operationalmanager.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
