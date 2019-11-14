package com.java.natchathira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.natchathira.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
