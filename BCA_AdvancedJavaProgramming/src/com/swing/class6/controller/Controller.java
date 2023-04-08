package com.swing.class6.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.swing.class6.model.Model;
import com.swing.class6.view.View;

public class Controller {

	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}
	
	
	public void btnClickEvent() {
		JButton btnClick =  view.getButtonClick();
		JTextField txtResult = view.getTextField();
		
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setCount();
				int result = model.getCount();
				
				txtResult.setText(""+result);
			}
		});
		
	}
	
	
}
