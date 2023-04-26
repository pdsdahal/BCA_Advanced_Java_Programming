package com.unit3.javabeans.class9.javabeanproperties;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class BoundPropertyDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String employeeName;
	PropertyChangeSupport pcs;
	
	public BoundPropertyDemo() {
		pcs = new PropertyChangeSupport(this);
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		
		String oldValue = this.employeeName;
		pcs.firePropertyChange("EmployeeName", oldValue, employeeName);
		this.employeeName = employeeName;
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		pcs.addPropertyChangeListener(pcl);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		pcs.removePropertyChangeListener(pcl);
	}
	
	
	public static void main(String[] args) {
		
		BoundPropertyDemo boundPropertyDemo = new BoundPropertyDemo();
		boundPropertyDemo.addPropertyChangeListener(new PropertyChangeListener() {
			
			public void propertyChange(PropertyChangeEvent evt) {
				 System.out.println("Old Value : "+evt.getOldValue() + " New Value : "+evt.getNewValue());
				
			}
		});
		
		boundPropertyDemo.setEmployeeName("Ram Panday");
		boundPropertyDemo.setEmployeeName("Shaym Shrestha");
		
		String emplyeeName = boundPropertyDemo.getEmployeeName();
		System.out.println("Employee Name : "+emplyeeName);
	
	}	
}
