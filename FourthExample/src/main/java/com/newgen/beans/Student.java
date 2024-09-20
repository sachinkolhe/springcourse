package com.newgen.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//POJO Plain Old Java Object
public class Student {
	
	private int id;
	private String name;
	
	
	@Autowired
//	@Qualifier("addr1")
	private Address myaddress;
	
	// Spring will check address is created or not 
	//		1. byType whether the beans/object is created for address
	//		2. byName of field
	//		3. then it will throw exception
	//		4. @Qualifier or @primary
	// if multiple address beans created then choose by bean name.
	
	
//	public Student() {
//		System.out.println(" student constructor called");
//	}
//	
//	
//	
//	public Student(int id, String name, Address address) {
//	
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("id method called");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name method called");
		this.name = name;
	}
	
	public Address getAddress() {
		return myaddress;
	}
	public void setAddress(Address address) {
		System.out.println("address method called");
		this.myaddress = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + myaddress + "]";
	}
	
	

}
