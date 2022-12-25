package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "my program started" );
        //spring jdbc => JdbcTemplate
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//			inserting value in the database
//        Student student=new Student();
//        student.setId(3223);
//        student.setName("John");
//        student.setCity("Lucknow");
//        int result=studentDao.insert(student);
//        System.out.println("student added."+result)
        
        //updating value in the database
//          Student student=new Student();
//          student.setId(457);
//          student.setName("Rohit");
//          student.setCity("Lucknow");
//          int result=studentDao.change(student);
//          System.out.println("data updated "+result);
          
//          //deleting value int the database
//          int result=studentDao.delete(222);
//          System.out.println("row deleted"+result);    
        	
//        //getting only one object
//        Student student=studentDao.getStudent(4576);
//        System.out.println(student);
        
        	List<Student> students=studentDao.getAllStudents(); 
        	for(Student s:students)
        	{
        		System.out.println(s);
        	}
        	
    }
}
