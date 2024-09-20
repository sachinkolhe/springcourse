package com.newgen.beans;

public class Address {

	private int houseno;
	private String city;
	private int pincode;
	
	public Address(){}
	
	public Address(int houseno, String city, int pincode) {
		
		System.out.println("Address constructor called.");
		this.houseno = houseno;
		this.city = city;
		this.pincode = pincode;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		System.out.println("houseno method called");
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("city method called");
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		System.out.println("pincode method called");
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
