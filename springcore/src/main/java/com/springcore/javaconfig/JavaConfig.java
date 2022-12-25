package com.springcore.javaconfig;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	//we can get this object by these differ differ names instead default name
	@Bean(name= {"student","temp","con"})
	public Student getStudent()
	{
		//creating a new student object
		Student student=new Student(getSamosa());
		return student;
	}

}
