package com.sample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    
    private String name;
    
	private String email;
    
    private String organisationService;
        
    public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrganisationService() {
		return organisationService;
	}

	public void setOrganisationService(String organisationService) {
		this.organisationService = organisationService;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [Id=");
		builder.append(Id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", organisationService=");
		builder.append(organisationService);
		builder.append("]");
		return builder.toString();
	}



}
