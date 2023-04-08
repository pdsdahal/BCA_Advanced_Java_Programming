package com.swing.class6.mvcdemo;

import com.swing.class6.controller.Controller;
import com.swing.class6.model.Model;
import com.swing.class6.view.View;

public class MVCDemo {
	
	public static void main(String[] args) {
		
		Model model = new Model();
		View  view = new View();
		Controller controller = new Controller(view, model);
		controller.btnClickEvent();
		
		
	}

}
