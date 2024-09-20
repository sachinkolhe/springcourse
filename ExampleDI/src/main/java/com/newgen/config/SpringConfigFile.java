package com.newgen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.newgen.beans.Address;
import com.newgen.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean(name="id9")
	public Student stdId(){
		Student st = new Student();
		st.setName("Balkrishna");
		st.setRollno(109);
//		st.setAddress(address());
		return st;
	}
	
	@Bean
	public Address address(){
		Address add = new Address();
		add.setHouseno(43);
		add.setCity("Pune");
		add.setPincode(234567);
		return add;
	}

}
