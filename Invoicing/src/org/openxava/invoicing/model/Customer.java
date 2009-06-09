package org.openxava.invoicing.model;

import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
public class Customer {
	
	@Id 
	@Column(length=6)
	private int number;
	
	@Column(length=50)
	@Required
	private String name;
			
	@Embedded @NoFrame
	private Address address;
	
	// Getters and setters
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
