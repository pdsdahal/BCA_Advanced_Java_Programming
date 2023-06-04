package com.unit5.rmi.class1.rmidemo;

import java.rmi.Naming;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {

		try {
			RMIInterfaceDemo interfaceDemo =  (RMIInterfaceDemo) Naming.lookup("rmi://localhost:2000/demo");
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter two numbers");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			int resultSum = interfaceDemo.add(num1, num2);
			System.out.println(num1+ " + "+num2 + " = "+resultSum);
		
			scanner.close();
		} catch (Exception e) {

		}

	}

}
