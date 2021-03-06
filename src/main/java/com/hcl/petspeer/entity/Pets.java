package com.hcl.petspeer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PETS")
public class Pets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pet_id")
	private Long id;

	@Column(name = "PET_NAME")
	private String petName;

	@Column(name = "PET_AGE")
	private int petAge;

	@Column(name = "PET_PLACE")
	private String petPlace;
	@ManyToOne
	@JoinColumn(name = "PET_USER_ID")
	private PetUser petUser;

	public Pets() {
		super();
	}

	public Pets(Long id, String petName, int petAge, String petPlace, PetUser petUser) {
		super();
		this.id = id;
		this.petName = petName;
		this.petAge = petAge;
		this.petPlace = petPlace;
		this.petUser = petUser;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public String getPetPlace() {
		return petPlace;
	}

	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}

	public PetUser getPetUser() {
		return petUser;
	}

	public void setPetUser(PetUser petUser) {
		this.petUser = petUser;
	}

}
