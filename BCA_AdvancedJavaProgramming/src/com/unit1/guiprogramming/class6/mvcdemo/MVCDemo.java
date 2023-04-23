package com.unit1.guiprogramming.class6.mvcdemo;

import com.unit1.guiprogramming.class6.controller.Controller;
import com.unit1.guiprogramming.class6.model.Model;
import com.unit1.guiprogramming.class6.view.View;

public class MVCDemo {
	
	public static void main(String[] args) {
		
		Model model = new Model();
		View  view = new View();
		Controller controller = new Controller(view, model);
		controller.btnClickEvent();
		
		
	}

}
