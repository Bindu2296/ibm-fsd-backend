package com.examples.spring.web.mvc.model;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
	@NotNull
	private String id;
	@Size(min=2, max=30)
	private String name;
	@NotNull @Min(18) @Max(100)
	private Integer age ;
	@NotNull
	private String gender;
	@NotNull
	private boolean contractor;
	@NotNull
	private List<String> skills;
	@NotNull
	private String designation;
	@NotNull
	private String department;
	@NotNull
	private String address;
	@NotNull
	private String country;	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean isContractor() {
		return contractor;
	}

	public void setContractor(boolean contractor) {
		this.contractor = contractor;
	}
	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
