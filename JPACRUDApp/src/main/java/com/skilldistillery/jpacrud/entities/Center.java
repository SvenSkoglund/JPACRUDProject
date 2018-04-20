package com.skilldistillery.jpacrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Center {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	String name;
	
	String description;
	
	String tradition;
	
	String address;
	
	String city;
	
	String state;
	
	String country;
	
	@Column(name="postal_code")
	String postalCode;
	
	String map;
	
	
	public Center() {
		
	}

	public Center(int id, String name, String tradition, String address, String city, String state, String country,
			String postalCode, String map) {
		super();
		this.id = id;
		this.name = name;
		this.tradition = tradition;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.map = map;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTradition() {
		return tradition;
	}

	public void setTradition(String tradition) {
		this.tradition = tradition;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Center [id=" + id + ", name=" + name + ", tradition=" + tradition + ", address=" + address + ", city="
				+ city + ", state=" + state + ", country=" + country + ", postalCode=" + postalCode + ", map=" + map
				+ "]";
	}
	
	
}
