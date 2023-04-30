package com.unit3.javabeans.class10.constrainedprops;

import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;

public class Broker implements Serializable {

	private static final long serialVersionUID = 1L;
	private int price=200;
	VetoableChangeSupport vcs;

	public Broker() {
		vcs = new VetoableChangeSupport(this);
	}

	public void setPrice(int price) throws PropertyVetoException {
		int oldPrice = this.price;
		vcs.fireVetoableChange("Price", oldPrice, price);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void addVetoableChangeListener(VetoableChangeListener vcl) {
		vcs.addVetoableChangeListener(vcl);
	}

	public void removeVetoableChangeListener(VetoableChangeListener vcl) {
		vcs.removeVetoableChangeListener(vcl);
	}

}
