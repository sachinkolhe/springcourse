package com.newgen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.newgen.beans.Student;

@Configuration
//@ComponentScan("com.newgen.beans")
public class SpringConfigFile {
	
//	@Bean(name="id9", initMethod="init", destroyMethod="cleanup")
	@Bean(name="id9", initMethod = "init", destroyMethod = "cleanup")
	public Student stdId(){
		Student st = new Student();
		st.setName("Balkrishna");
		st.setEmail("balkrishna@gmail.com");
		st.setRollno(109);
		return st;
	}

}
