package com.newgen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.newgen.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean(name="studentId1", initMethod = "init", destroyMethod = "cleanup")
	public Student stdId(){
		Student st = new Student();
		st.setName("Balkrishna");
		st.setEmail("balkrishna@gmail.com");
		st.setRollno(109);
		return st;
	}

}
