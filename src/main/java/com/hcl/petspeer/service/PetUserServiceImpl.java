package com.hcl.petspeer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.petspeer.entity.PetUser;
import com.hcl.petspeer.entity.Pets;
import com.hcl.petspeer.repository.PetUserRepository;
import com.hcl.petspeer.repository.PetsRepository;

@Service
public class PetUserServiceImpl implements PetUserService {
	@Autowired
	PetUserRepository petUserRepository;
	@Autowired
	PetsRepository petsRepository;

	@Override
	public void addPetUser(PetUser petuser) {
		petUserRepository.save(petuser);
	}

	@Override
	public Long getuNameAndUpassword(String uname, String upass) {
		return petUserRepository.getuNameAndUpassword(uname,upass);
	}

	@Override
	public Pets buyPet(Long petId, PetUser puser) {
		Pets pet=petsRepository.findById(petId).get();
		pet.setpUser(puser);
		return petsRepository.save(pet);
	}

	@Override
	public PetUser findByUserName(String username) {
		return petUserRepository.findByUserName(username);
	}

	

}
