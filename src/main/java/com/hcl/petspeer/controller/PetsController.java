package com.hcl.petspeer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.petspeer.entity.PetUser;
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

	@GetMapping(value = "/buypet/{petId}")
	public ResponseEntity buypet(@PathVariable Long petId, @RequestParam String uname, @RequestParam String upass) {
		Long flag = petUserService.getuNameAndUpassword(uname, upass);
		if (flag != 1) {
			return new ResponseEntity("signin for buying", HttpStatus.BAD_REQUEST);
		}
		PetUser puser = petUserService.findByUserName(uname);
		Pets pet = petUserService.buyPet(petId, puser);
return new ResponseEntity("pet added to list",HttpStatus.OK);
	}

}
