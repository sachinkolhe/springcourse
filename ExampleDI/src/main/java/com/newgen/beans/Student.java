package com.newgen.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rollno;

//	@Autowired
	private Address address;

	private String name;

	public Student() {
	}

//	public Student(int rollno, Address address, String name) {
//		super();
//		this.rollno = rollno;
//		this.address = address; // manual DI
//		this.name = name;
//	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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
		this.address = address; // manual DI
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", address=" + address + ", name=" + name + "]";
	}

}
