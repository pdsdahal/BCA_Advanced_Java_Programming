package com.unit1.guiprogramming.class4.swinglayout;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlowLayoutDemo extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JLabel lblName, lblClass, lblRollNo;
	JTextField txtName, txtClass, txtRollNo;
	
	public FlowLayoutDemo() {
		
		setTitle("Flow Layout");
		setBounds(10, 10, 300, 500);
		
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
		setLayout(flowLayout);
	
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
		new FlowLayoutDemo();
	}
}
