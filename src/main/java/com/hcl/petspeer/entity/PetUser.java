package com.hcl.petspeer.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PET_USER")
//@SecondaryTable(name = "PETS", pkJoinColumns = @PrimaryKeyJoinColumn(name = "PETS_Id", referencedColumnName = "id"))
public class PetUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PET_USER_ID")
	private Long id;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "USER_PASSWORD")
	private String userPassword;
	@Transient
	@Column(name = "USER_ConformPASSWORD")
	private String userConformPassword;
	@OneToMany
	@JoinColumn(name = "pet_id")
	private List<Pets> petLists;
	
	public PetUser() {
		super();
	}
	
	public PetUser(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public PetUser(Long id, String userName, String userPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserConformPassword() {
		return userConformPassword;
	}
	public void setUserConformPassword(String userConformPassword) {
		this.userConformPassword = userConformPassword;
	}
	public List<Pets> getPetLists() {
		return petLists;
	}
	public void setPetLists(List<Pets> petLists) {
		this.petLists = petLists;
	}

	

}
