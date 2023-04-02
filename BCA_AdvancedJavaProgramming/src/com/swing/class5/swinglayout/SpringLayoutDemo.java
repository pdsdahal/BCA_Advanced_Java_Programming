package com.swing.class5.swinglayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SpringLayoutDemo extends JFrame {

	JLabel lblFirstName, lblLastName;
	JTextField txtFirstName, txtLastName;
	
	public SpringLayoutDemo() {
		setTitle("Spring Layout");
		setBounds(10, 10, 600, 700);
	
		
		JPanel panel = new JPanel();
		SpringLayout springLayout = new SpringLayout();
		panel.setLayout(springLayout);
		
		lblFirstName = new JLabel("First Name : ");
		springLayout.putConstraint(SpringLayout.WEST, lblFirstName, 10, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.NORTH, lblFirstName, 10, SpringLayout.NORTH, panel);
		panel.add(lblFirstName);
		
		txtFirstName = new JTextField(20);
		springLayout.putConstraint(SpringLayout.WEST, txtFirstName, 10, SpringLayout.EAST, lblFirstName);
		springLayout.putConstraint(SpringLayout.NORTH, txtFirstName, 10, SpringLayout.NORTH, panel);
		panel.add(txtFirstName);
		
		lblLastName = new JLabel("Last Name : ");
		
		txtLastName = new JTextField(20);
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new SpringLayoutDemo();
	}
	
}
