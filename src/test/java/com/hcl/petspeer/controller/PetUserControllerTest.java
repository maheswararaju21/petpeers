package com.hcl.petspeer.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.petspeer.entity.PetUser;
import com.hcl.petspeer.service.PetUserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class PetUserControllerTest {
	private static final String message = "Login was successful";
	private static final PetUser TEST_POINT = new PetUser("satvik", "welcome");
	@Mock
	PetUserServiceImpl petUserServices;
	@Mock
	PetUser petuser;

	@Test
	public void addPetUserTest() {
		PetUser expected = new PetUser("satvik", "welcome");
		//when(petUserServices.addPetUser(petuser)).thenReturn(expected);
	}
}
