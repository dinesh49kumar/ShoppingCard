package com.shoping.card.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@Column(name = "Customer_Id", nullable = false)
	String CustomerId;
	@Column(name = "Customer_Name", nullable = false)
	String name;
	@Column(name = "Date_Of_Birth")
	Date DOB;
	@Column(name = "Gender")
	String gender;
	@Column(name = "Salary")
	long salary;
	@Column(name = "Country")
	String country;
//    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Set<Card> cards;
//	
//    public Customer(String customerId, String name, String gender, long salary) {
//		super();
//		CustomerId = customerId;
//		name = name;
//		this.gender = gender;
//		this.salary = salary;
//	}  
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
}
