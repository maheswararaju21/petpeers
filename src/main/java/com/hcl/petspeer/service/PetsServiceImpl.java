package com.hcl.petspeer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.petspeer.entity.Pets;
import com.hcl.petspeer.repository.PetsRepository;

@Service
public class PetsServiceImpl implements PetsService {
	@Autowired
	PetsRepository petsRepository;

	@Override
	public void addPets(Pets pets) {
		petsRepository.save(pets);
	}

	@Override
	public List<Pets> getAllPets() {
		System.out.println("all pet method called");
		return petsRepository.findAll();
	}
}
