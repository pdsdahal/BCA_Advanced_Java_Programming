package com.unit3.javabeans.class10.persistenceprop;

import java.io.Serializable;

public class FactorialBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private int num;
	private int factorial;

	public FactorialBean() {

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

	
		this.factorial = fact;
		this.num = num;
	}
	
	public int getFactorial() {
		return factorial;
	}

}
