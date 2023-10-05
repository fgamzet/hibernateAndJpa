package com.javacourse.project.hibernateAndJpa.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="city")
public class City {
	@Id
	@Column(name = "ID") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="Name")
	private String name;

	@Column(name="Countrycode") //camel case yazınca country_code olarak algılıyor dolayısıyla değerler null dönüyor.  
	private String countryCode;

	@Column(name="District")
	private String district;

	@Column(name="Population")
	private int population;
	
	public City(int ID, String name, String countrycode, String district, int population) {
		super();
		this.id = ID;
		this.name = name;
		this.countryCode = countrycode;
		this.district = district;
		this.population = population;
	}
	public City() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
}
