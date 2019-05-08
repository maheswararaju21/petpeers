package com.hcl.petspeer.service;

import java.util.List;

import com.hcl.petspeer.entity.Pets;

public interface PetsService {
	void addPets(Pets pets);

	public String buyPets(long petId, long userId);

	List<Pets> getAllPets();
}
