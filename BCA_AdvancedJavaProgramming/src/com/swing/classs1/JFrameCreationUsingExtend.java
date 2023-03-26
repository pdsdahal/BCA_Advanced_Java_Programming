package com.swing.classs1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameCreationUsingExtend extends JFrame{

	JLabel lblUserName;
	JTextField txtUserName;
	
	
	public JFrameCreationUsingExtend() {
		
		setBounds(10, 10, 500, 700);
		setTitle("First Class");
		setVisible(true);
		setLayout(null);
		
		Container container =  getContentPane();
		container.setBackground(Color.GRAY);
		
		lblUserName = new JLabel("UserName : ");
		lblUserName.setBounds(10, 15, 100, 70);
		
		
		txtUserName = new JTextField();
		txtUserName.setBounds(115, 15, 100, 70);
		
		
		
		add(lblUserName);
		add(txtUserName);
		
		//container.add(lblUserName);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new JFrameCreationUsingExtend();
	}
	
}
