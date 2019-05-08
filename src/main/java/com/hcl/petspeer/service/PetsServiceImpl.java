package com.hcl.petspeer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.petspeer.entity.PetUser;
import com.hcl.petspeer.entity.Pets;
import com.hcl.petspeer.repository.PetUserRepository;
import com.hcl.petspeer.repository.PetsRepository;

@Service
public class PetsServiceImpl implements PetsService {
	@Autowired
	PetsRepository petsRepository;
	@Autowired
	PetUserRepository petUserRepository;

	@Override
	public void addPets(Pets pets) {
		petsRepository.save(pets);
	}

	@Override
	public List<Pets> getAllPets() {
		System.out.println("all pet method called");
		return petsRepository.findAll();
	}

	@Override
	public String buyPets(long petId, long userId) {
		PetUser petUser = new PetUser();
		petUser = petUserRepository.findById(userId).get();
		Pets pet = new Pets();
		pet = petsRepository.findById(petId).get();
		pet.setPetUser(petUser);
		petsRepository.save(pet);
		return "Pet Byed Success";
	}
}
