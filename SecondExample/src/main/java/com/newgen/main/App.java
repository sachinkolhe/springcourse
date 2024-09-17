package com.newgen.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newgen.beans.Department;
import com.newgen.beans.Student;
import com.newgen.config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Example 3 - Annotation with xml
//  	 String configLoc = "/com/newgen/resources/spring-config.xml";
//  	 
//     ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLoc);
//     
//     Student bean = (Student) applicationContext.getBean("student");
//     
//     String studentString = bean.toString();
//     
//     System.out.println(studentString);  
//     
//     
//     Department dept = (Department) applicationContext.getBean("department");
//     
//     System.out.println(dept);  
    	
    	
    	
    	//Example 4 : Annotation read through java file
    	
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
      Student bean = (Student) applicationContext.getBean("student");
      String studentString = bean.toString();
      System.out.println(studentString);
    }
}
