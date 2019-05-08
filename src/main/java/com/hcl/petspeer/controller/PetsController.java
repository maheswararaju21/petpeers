package com.hcl.petspeer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.petspeer.entity.Pets;
import com.hcl.petspeer.service.PetUserService;
import com.hcl.petspeer.service.PetsService;

@RestController
@RequestMapping(value = "/petsregister")
public class PetsController {
	@Autowired
	PetsService petsService;
	@Autowired
	PetUserService petUserService;

	@RequestMapping(value = "/addpets")
	ResponseEntity<String> addPets(@RequestBody Pets pets) {
		petsService.addPets(pets);
		return new ResponseEntity<String>("pets added", HttpStatus.OK);
	}

	@GetMapping(value = "/getallpets")
	List<Pets> getPets() {
		return petsService.getAllPets();
	}

	@PutMapping(value="/buypets/{petId}")
	@ResponseBody ResponseEntity<String> buyPet(@PathVariable("petId") long petId,@RequestParam long userId){	
		return new ResponseEntity<String>(petsService.buyPets(petId, userId),HttpStatus.OK);
	}

}
