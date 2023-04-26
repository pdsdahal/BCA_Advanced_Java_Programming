package com.unit3.javabeans.class9.javabeanproperties;

import java.io.Serializable;

public class BooleanPropertyDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private boolean clicked;
	
	public BooleanPropertyDemo() {
		
	}
	
	public void setClicked(boolean clicked) {
		this.clicked = clicked;
	}
	
	public boolean isClicked() {
		return clicked;
	}
	
	

}
