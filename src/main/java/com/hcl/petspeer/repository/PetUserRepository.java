package com.hcl.petspeer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.petspeer.entity.PetUser;

@Repository
public interface PetUserRepository extends JpaRepository<PetUser, Long> {

	
}
