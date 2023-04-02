package com.swing.class4.swinglayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutDemo extends JFrame {

	JLabel lblName, lblClass, lblRollNo;
	JTextField txtName, txtClass, txtRollNo;
	
	public GridLayoutDemo() {
		
		setTitle("Grid Layout");
		setBounds(10, 10, 300, 500);
		
		GridLayout gridLayout = new GridLayout(3, 2);
		setLayout(gridLayout);
	
		lblName = new JLabel("Name : ");
		txtName = new JTextField(20);
		
		lblClass = new JLabel("Class : ");
		txtClass = new JTextField(20);
		
		lblRollNo = new JLabel("RollNo : ");
		txtRollNo = new JTextField(20);
		
		
		add(lblName);
		add(txtName);
		add(lblClass);
		add(txtClass);
		add(lblRollNo);
		add(txtRollNo);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new GridLayoutDemo();
	}
}
