package com.java.natchathira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.natchathira.entity.NomineeMySelf;

@Repository
public interface NomineeMySelfRepository extends JpaRepository<NomineeMySelf, Long>{

	
}
