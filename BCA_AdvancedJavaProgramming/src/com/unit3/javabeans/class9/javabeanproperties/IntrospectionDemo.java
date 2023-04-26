package com.unit3.javabeans.class9.javabeanproperties;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;

public class IntrospectionDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	private int age;

	public IntrospectionDemo() {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(IntrospectionDemo.class);
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
			
			for(PropertyDescriptor pd : pds) {
				System.out.println("Read Method : "+pd.getReadMethod());
				System.out.println("Write Method : "+pd.getWriteMethod());
			}
			
			
		} catch (Exception e) {

		}
	}

}
