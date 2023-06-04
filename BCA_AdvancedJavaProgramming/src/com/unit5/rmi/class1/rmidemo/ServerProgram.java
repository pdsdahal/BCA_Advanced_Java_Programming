package com.unit5.rmi.class1.rmidemo;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerProgram {
	
	public static void main(String[] args) {
		
		try {
			RMIInterfaceDemoImpl obj = new RMIInterfaceDemoImpl();
			LocateRegistry.createRegistry(2000);
			Naming.rebind("rmi://localhost:2000/demo", obj);
			System.out.println("Server Started....");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
