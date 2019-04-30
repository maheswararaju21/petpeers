package com.hcl.petspeer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PETS")
public class Pets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "PET_NAME")
	private String petName;

	@Column(name = "PET_AGE")
	private int petAge;

	@Column(name = "PET_PLACE")
	private String petPlace;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PETUSER_ID")
	@JsonIgnore
	private PetUser pUser;

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

	public PetUser getpUser() {
		return pUser;
	}

	public void setpUser(PetUser pUser) {
		this.pUser = pUser;
	}

}
