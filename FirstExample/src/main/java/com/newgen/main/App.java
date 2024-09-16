package com.newgen.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
   	 
    //Example .. read config through xml file
//      String configLoc = "/com/newgen/resources/spring-config.xml";
//   	 
//      //creating an object of ApplicationContext
//      ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLoc);
//      
//      Student st = (Student) applicationContext.getBean("studentId1");
//      
//      System.out.println("Student object created..");
//      System.out.println(st);
//     
//      
//      Student st2 = (Student) applicationContext.getBean("studentId2");
//      
//      System.out.println("Student object created..");
//      System.out.println(st2);
    
    	//Example 2 .. read config through java file
    	
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
    	
      Student bean = (Student) applicationContext.getBean("studentId1");
      
      String studentString = bean.toString();
      
      System.out.println(studentString);
    	
    }
    /**
     * 1. Created POJO Class
     * 2. Create config xml
     * 3. create appContext
     * 
     * 
     * */
}
