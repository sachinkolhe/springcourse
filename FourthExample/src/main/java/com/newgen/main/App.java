package com.newgen.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    	
    	//reading through xml config
//    	 String configLoc = "/com/newgen/resources/spring-config.xml";
//         ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLoc);
//         Student bean = (Student) applicationContext.getBean("stdId");
//         String studentString = bean.toString();
//         System.out.println(studentString);
         
         
         //reading through java config file
         
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFile.class);
      Student bean = (Student) applicationContext.getBean("studentId123");
      String studentString = bean.toString();
      System.out.println(studentString);
         
    }
}
