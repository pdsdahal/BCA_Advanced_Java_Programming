package com.unit5.rmi.class1.rmidemo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterfaceDemo extends Remote {

	public int add(int num1, int num2) throws RemoteException;
	public double div(double num1, double num2) throws RemoteException;
	public String concat(String data1, String data2) throws RemoteException;
	public int getFact(int num) throws RemoteException;
}
