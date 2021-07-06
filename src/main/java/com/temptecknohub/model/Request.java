package com.temptecknohub.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "requests")
public class Request {
	private String FirstName;
	private String LastName;
	private String Email;
	private String City;
	private String State;
	private String PhoneNumber;
	private String Description;

	public Request(String FirstName, String LastName, String Email, String City, String State, String PhoneNumber,
			String Description) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.City = City;
		this.State = State;
		this.PhoneNumber = PhoneNumber;
		this.Description = Description;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	@Override
	public String toString() {
		return "Request [firstName=" + FirstName + ", lastName=" + LastName + ", email=" + Email + ", city=" + City
				+ ", state=" + State + ", phoneNumber=" + PhoneNumber + ", description=" + Description + "]";
	}

}
