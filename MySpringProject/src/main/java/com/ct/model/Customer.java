package com.ct.model;

public class Customer {

	private String email;
	private String password;
	private String mobile;
	private String city;
	
	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", mobile=" + mobile + ", city=" + city + "]";
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
