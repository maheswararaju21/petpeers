package com.hcl.petspeer.service;

import com.hcl.petspeer.entity.PetUser;
import com.hcl.petspeer.entity.Pets;

public interface PetUserService {
	void addPetUser(PetUser petuser);
	Long getuNameAndUpassword(String uname,String upass);
	Pets buyPet(Long petId,PetUser puser);
	
	PetUser findByUserName(String username);
}
