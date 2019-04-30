package com.hcl.petspeer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.petspeer.entity.PetUser;
import com.hcl.petspeer.entity.Pets;
import com.hcl.petspeer.service.PetUserService;
import com.hcl.petspeer.service.PetsService;

@RestController
@RequestMapping(value = "/petuser")
public class PetUserController {
	@Autowired
	PetUserService petUserServices;
	@Autowired
	PetsService petsService;

	@PostMapping(value = "/petuserlogin")
	public @ResponseBody ResponseEntity<Object> addPetUser(@RequestBody PetUser pusers) {
		if (pusers.getUserPassword().equals(pusers.getUserConformPassword())) {
			System.out.println(pusers.getUserPassword());
			System.out.println(pusers.getUserConformPassword());
			petUserServices.addPetUser(pusers);
			List<Pets> entityList = petsService.getAllPets();
			return new ResponseEntity<Object>(entityList, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>("passsword and confirm password miss match", HttpStatus.NOT_FOUND);
		}

	}
}
