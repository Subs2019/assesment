package org.cts.customer;

/*
 * Customer class with this properties.
 */
public class Customer {

	private String firstName, lastName, gender, location, contact;
	/*
	 * Const. with parameters.
	 */
	public Customer(String firstName, String lastName, String gender,
			String location, String contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.location = location;
		this.contact = contact;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getLocation() {
		return location;
	}
	public String getContact() {
		return contact;
	}

	 

}