package com.unit5.rmi.class1.rmidemo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIInterfaceDemoImpl extends UnicastRemoteObject implements RMIInterfaceDemo {

	public RMIInterfaceDemoImpl() throws RemoteException {
		super();
	}

	public int add(int num1, int num2) throws RemoteException {
		return num1+num2;
	}

	public double div(double num1, double num2) throws RemoteException {
		return num1/num2;
	}

	public String concat(String data1, String data2) throws RemoteException {
		return data1+data2;
	}

	public int getFact(int num) throws RemoteException {
		
		int fact= 1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}

}
