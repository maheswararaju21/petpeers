package com.hcl.petspeer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "PET_USER")
//@SecondaryTable(name = "PETS", pkJoinColumns = @PrimaryKeyJoinColumn(name = "PETS_Id", referencedColumnName = "id"))
public class PetUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "USER_PASSWORD")
	private String userPassword;
	@Column(name = "USER_ConformPASSWORD")
	private String userConformPassword;
	
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

}
