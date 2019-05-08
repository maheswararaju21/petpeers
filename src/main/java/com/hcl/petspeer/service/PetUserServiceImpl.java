package com.hcl.petspeer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.petspeer.entity.PetUser;
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



	

}
