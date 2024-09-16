package com.newgen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.newgen.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean(name="studentId1")
	public Student stdId(){
		Student st = new Student();
		st.setName("Balkrishna");
		st.setId(333);
		return st;
	}
	
//	<bean class="com.newgen.beans.Student" id="studentId1">
//	<property name="id" value="111" />
//	<property name="name" value="Prathamesh" />
//</bean>

}
