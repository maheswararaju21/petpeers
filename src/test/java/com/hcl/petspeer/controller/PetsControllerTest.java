package com.hcl.petspeer.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.petspeer.entity.PetUser;
import com.hcl.petspeer.entity.Pets;
import com.hcl.petspeer.service.PetsServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class PetsControllerTest {
	@Mock
	PetsServiceImpl petsService;
	/*
	 * @InjectMocks PetUserServiceImpl petUserService;
	 	@Mock
	PetsRepository petsRepository;
	*/
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getPetsTest() {
		List<Pets> pets = new ArrayList<Pets>();
		PetUser pUser = new PetUser(1L, "satvik", "welcome");
		PetUser pUserone = new PetUser(2L, "chotabheem", "hello");
		Pets petsone = new Pets(1L, "parrot", 5, "mumbai", pUser);
		Pets petstwo = new Pets(2L, "cat", 21, "hyderabad", pUserone);
		pets.add(petsone);
		pets.add(petstwo);
		when(petsService.getAllPets()).thenReturn(pets);

		List<Pets> petList = petsService.getAllPets();
		assertEquals(2, petList.size());
		verify(petsService, times(1)).getAllPets();
	}
}
