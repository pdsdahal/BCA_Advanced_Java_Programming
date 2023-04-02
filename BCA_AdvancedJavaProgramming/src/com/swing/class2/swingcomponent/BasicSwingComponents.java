package com.swing.class2.swingcomponent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class BasicSwingComponents extends JFrame {

	JLabel lblDescription;
	JTextArea txtDescription;
	
	JButton btnSubmit;
	
	
	public BasicSwingComponents() {
		setTitle("Text Area");
		setBounds(10, 10, 600, 500);
		setLayout(null);
		
		lblDescription = new JLabel("Description : ");
		lblDescription.setBounds(10, 50, 100, 70);
		
		
		txtDescription = new JTextArea();
		txtDescription.setBounds(10,130, 200, 150);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(20, 290, 100, 70);
		
		add(lblDescription);
		add(txtDescription);
		add(btnSubmit);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new BasicSwingComponents();
	}

	
	
}
