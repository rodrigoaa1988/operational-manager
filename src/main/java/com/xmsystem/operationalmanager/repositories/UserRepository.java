package com.xmsystem.operationalmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xmsystem.operationalmanager.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
