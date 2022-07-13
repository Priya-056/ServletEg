package com.sonata.Springdemo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	 private String email;
	    private String Lname;
	    private String Fname;
	    private String Street;
	    private String City;
	    private String State;
	    private String Country;
	    private int pin;
	    
	    Address(){
	    	
	    }

		public Address(String email, String lname, String fname, String street, String city, String state,
				String country, int pin) {
			super();
			this.email = email;
			Lname = lname;
			Fname = fname;
			Street = street;
			City = city;
			State = state;
			Country = country;
			this.pin = pin;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getLname() {
			return Lname;
		}

		public void setLname(String lname) {
			Lname = lname;
		}

		public String getFname() {
			return Fname;
		}

		public void setFname(String fname) {
			Fname = fname;
		}

		public String getStreet() {
			return Street;
		}

		public void setStreet(String street) {
			Street = street;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public String getCountry() {
			return Country;
		}

		public void setCountry(String country) {
			Country = country;
		}

		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}

		@Override
		public String toString() {
			return "Address [email=" + email + ", Lname=" + Lname + ", Fname=" + Fname + ", Street=" + Street
					+ ", City=" + City + ", State=" + State + ", Country=" + Country + ", pin=" + pin + "]";
		}
	    
}
