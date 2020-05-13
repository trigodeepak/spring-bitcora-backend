package com.bicora.backend.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bicora.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
