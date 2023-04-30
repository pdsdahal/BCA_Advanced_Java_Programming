package com.unit3.javabeans.class10.persistenceprop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveFactorialBean {
	
	public static void main(String[] args) throws IOException {
		
		FactorialBean factorialBean = new FactorialBean();
		factorialBean.setNum(5);
		int facto  = factorialBean.getFactorial();
		System.out.println("Fact : "+facto);
		
		//write 
		FileOutputStream outputStream = new FileOutputStream("factorial.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(factorialBean);
		objectOutputStream.close();
		outputStream.close();
		
	}

}
