package com.springcore.auto.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wired/autoconfig.xml");
		//if we don't want to use type casting we can use this
		Emp emp1=context.getBean("emp1",Emp.class);
		System.out.println(emp1);
	}

}
