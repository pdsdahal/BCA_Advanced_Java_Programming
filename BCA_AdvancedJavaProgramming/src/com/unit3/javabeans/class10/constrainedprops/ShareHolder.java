package com.unit3.javabeans.class10.constrainedprops;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class ShareHolder implements VetoableChangeListener {

	@Override
	public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
	
		if(evt.getPropertyName().equals("Price")) {
			
			int newPrice = (int) evt.getNewValue();
			if(newPrice>205) {
				throw new PropertyVetoException("Not interested", evt);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Broker broker = new Broker();
		ShareHolder shareHolder = new ShareHolder();
		broker.addVetoableChangeListener(shareHolder);
		
		try {
			broker.setPrice(400);
			System.out.println("Price : "+broker.getPrice());
		} catch (PropertyVetoException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
