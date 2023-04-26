package com.unit3.javabeans.class9.javabeanproperties;

import java.io.Serializable;

public class SimplePropertyDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//double, int, float, long, String, char
	private double salary;
	
	public SimplePropertyDemo() {
		
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
}
