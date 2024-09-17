package com.newgen.beans;


public class Student  {
	

	private int rollno;

	private String email;

	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", email=" + email + ", name=" + name + "]";
	}
	
	//
	
	// Initialization method
    public void init() {
    	System.out.println("Printing student object " + this);
    	System.out.println("this is after Initialization");
        
    }

    // Destruction method
    public void cleanup() {
    	System.out.println("Printing Student object " +  this);
        System.out.println("this is before Destruction");
    }


	

}
