package com.unit1.guiprogramming.classwork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q1Square extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JLabel lblNum1, lblResult;
	JTextField txtNum1, txtResult;
	JButton btnSubmit;
	
	public Q1Square() {
		setTitle("Q1. Find the square");
		setBounds(10, 10, 600, 700);
		setLayout(null);
		lblNum1 = new JLabel("Num1 : ");
		lblNum1.setBounds(10, 10, 100, 70);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(110, 10, 200, 50);

		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(50, 85, 100, 40);
		btnSubmit.addActionListener(this);
		
		
		lblResult = new JLabel("Result : ");
		lblResult.setBounds(10, 130, 100, 70);
		
		txtResult = new JTextField();
		txtResult.setBounds(120, 130, 200, 40);
		
		add(lblNum1);
		add(txtNum1);
		add(btnSubmit);
		add(lblResult);
		add(txtResult);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
	
		new Q1Square();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int num1 = Integer.parseInt(txtNum1.getText());
		
		int result = num1 * num1;
		
		txtResult.setText(""+result);
	}
}
