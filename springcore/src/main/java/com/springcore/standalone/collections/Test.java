package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person person1=(Person)context.getBean("person1");
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println(person1.getFeestructure());
		System.out.println(person1.getFeestructure().getClass().getName());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println(person1.getProperties());
	}

}
