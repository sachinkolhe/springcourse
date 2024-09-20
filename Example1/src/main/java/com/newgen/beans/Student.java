package com.newgen.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student implements InitializingBean, DisposableBean {
	
	@Value("1011")
	private int rollno;
	@Value("balkrishna@bknewgen.com")
	private String email;
	@Value("Balkrishna")
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
    	System.out.println(this);
    	System.out.println("MyService: Initialization");
        
    }

    // Destruction method
    public void cleanup() {
    	System.out.println(this);
        System.out.println("MyService: Destruction");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    	System.out.println(this);
        System.out.println("MyService: afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
    	System.out.println(this);
        System.out.println("MyService: destroy");
    }
	
	

}
