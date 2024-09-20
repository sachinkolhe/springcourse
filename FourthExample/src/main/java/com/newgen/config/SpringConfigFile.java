package com.newgen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.newgen.beans.Address;
import com.newgen.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean(name="studentId123")
	public Student stdId(){
		Student st = new Student();
		st.setName("Balkrishna");
		st.setId(109);
		return st;
	}
	
	@Bean(name="addr1")
	public Address address(){
//		Address add = new Address();
//		add.setHouseno(43);
//		add.setCity("Pune");
//		add.setPincode(234567);
//		return add;
		
		Address add = new Address(43, "Pune", 23456);
		return add;
	}
	
	@Bean(name="addr2")
	public Address address2(){
		Address add = new Address(22, "Mumbai", 22222);
		return add;
	}
	
	@Primary
	@Bean(name="addr3")
	public Address address3(){
		Address add = new Address(43, "Delhi", 23456);
		return add;
	}
	
	
	

}
