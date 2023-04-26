package com.unit3.javabeans.class9.javabeanproperties;

import java.io.Serializable;

public class IndexPropertyDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String[] employeeNames;
	
	public IndexPropertyDemo() {
		
	}
	
	public void setEmployeeNames(String[] employeeNames) {
		this.employeeNames = employeeNames;
	}
	
	public String[] getEmployeeNames() {
		return employeeNames;
	}
	
}
