package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	//using expression language
	@Value("#{22+11}")
	private int x;
	@Value("#{34%4}")
	private int y;
	//invoking static method using SpEL
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	//printing the value of PI using SpEL
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	//creating object and setting name using SpEL
	@Value("#{new java.lang.String('Anubhav Rajput')}")
	private String name;
	@Value("#{8-2>3}")
	private boolean isActive;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	

}
