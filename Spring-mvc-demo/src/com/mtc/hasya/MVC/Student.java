package com.mtc.hasya.MVC;

import java.util.LinkedHashMap;



public class Student {

	//regular expression that allow 5 character/digits for lastname
	@pattern(regexp= "^[a-zA-Z0-9] {5}", message = "only 5 chars/digits")
	public String Firstname;
	
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	
	@NotNull(message = "is required")
	//if type is int the message is required not dispalye and long zibberish is displayed, for this we use integer class
	
	 public Integer id;
	public String Lastname;
	public String country;
	private LinkedHashMap<String,String> countryOptions;
	public String favouriteLanguage;
	public String[] operatingSystem;
	
//	@Course(value = "CS", message = "Must start with CS")
//	private String Course;
//	
//	
//	public String getCourse() {
//		return Course;
//	}
//
//
//	public void setCourse(String course) {
//		Course = course;
//	}


	public String[] getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}


	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
	
		
	}
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
}
