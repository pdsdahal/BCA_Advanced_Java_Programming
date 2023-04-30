package com.unit3.javabeans.class10.persistenceprop;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFactorialBean {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//read 
		FileInputStream inputStream = new FileInputStream("factorial.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		FactorialBean factorialBean =  (FactorialBean) objectInputStream.readObject();
		
		int factorial =  factorialBean.getFactorial();
		int num = factorialBean.getNum();
		
		System.out.println("Num : "+num);
		System.out.println("Factorial: "+factorial);
		objectInputStream.close();
		inputStream.close();
		
	}

}
