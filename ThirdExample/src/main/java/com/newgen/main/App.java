package com.newgen.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.newgen.beans.Student;
import com.newgen.config.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//context creation: spring container
      AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFile.class);
      
      //create bean of studentid1
      Student bean = (Student) applicationContext.getBean("studentId1");
      String studentString = bean.toString();
      
      //do some operation on this bean
      System.out.println(studentString);
      
      //close the applicationContext
      applicationContext.close();
    }
}
