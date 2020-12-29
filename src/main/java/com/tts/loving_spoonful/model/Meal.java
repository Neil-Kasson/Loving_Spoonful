package com.tts.loving_spoonful.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meal {
	
	  ////////////
	 // Fields //
	////////////

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String image;

	private int calories;

	

	  //////////////////
	 // Constructors //
	//////////////////

	public Meal() {
	}

	public Meal(Long id, String name, String image, int calories) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.calories = calories;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCalories() {
		return this.calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}


		
	  //////////////
	 // toString //
	//////////////

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", image='" + getImage() + "'" +
			", calories='" + getCalories() + "'" +
			"}";
	}

}
