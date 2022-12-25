package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if we want to close the context then we have to use the ClassPathXmlApplicationContext on both sides
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class); 
		Student student=con.getBean("con",Student.class);
		System.out.println(student);
		student.study();
	}

	
}
