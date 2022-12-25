package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo d1=con.getBean("demo",Demo.class);
		System.out.println(d1);
		SpelExpressionParser temp=new SpelExpressionParser();
		//passing direct expression because we are using class
		Expression expression=temp.parseExpression("32+343-34");
		System.out.println(expression.getValue());	
	}

}
