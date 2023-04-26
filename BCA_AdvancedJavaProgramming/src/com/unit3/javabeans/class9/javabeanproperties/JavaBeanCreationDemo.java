package com.unit3.javabeans.class9.javabeanproperties;

import java.io.Serializable;

public class JavaBeanCreationDemo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private int age;

	public JavaBeanCreationDemo() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
