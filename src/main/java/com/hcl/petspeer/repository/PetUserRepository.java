package com.hcl.petspeer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.petspeer.entity.PetUser;

@Repository
public interface PetUserRepository extends JpaRepository<PetUser, Long> {

	PetUser findByUserName(String username);
	
	 @Query("SELECT count(t) FROM PetUser t WHERE t.USER_NAME = :uname AND t.USER_PASSWORD = :upass")
	   Long getuNameAndUpassword(String username,String userpassword);
}
