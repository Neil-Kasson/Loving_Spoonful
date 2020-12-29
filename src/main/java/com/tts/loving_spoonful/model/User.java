package com.tts.loving_spoonful.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User{

	  ////////////
	 // Fields //
	////////////

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String Username;

	private String password;

	private int active;



	  //////////////////
	 // Constructors //
	//////////////////

	public User() {
	}

	public User(Long id, String Username, String password, int active) {
		this.id = id;
		this.Username = Username;
		this.password = password;
		this.active = active;
	}


	
	  ///////////////////////
	 // Getters & Setters //
	///////////////////////

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	
	
	  //////////////
	 // toString //
	//////////////

	@Override
	public String toString() {
		return "{" +
			" id='" + id + "'" +
			", Username='" + Username + "'" +
			", password='" + password + "'" +
			", active='" + active + "'" +
			"}";
	}

}