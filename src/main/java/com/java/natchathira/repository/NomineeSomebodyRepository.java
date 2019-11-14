package com.java.natchathira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.natchathira.entity.NomineeMySelf;
import com.java.natchathira.entity.NomineeSomebody;

@Repository
public interface NomineeSomebodyRepository extends JpaRepository<NomineeSomebody, Long>{

	
}
