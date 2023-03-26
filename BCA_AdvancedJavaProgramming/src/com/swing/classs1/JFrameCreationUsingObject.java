package com.swing.classs1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameCreationUsingObject {

	public static void main(String[] args) {
		
		JFrame frame  = new JFrame();
		frame.setTitle("First Day");
		frame.setBounds(10, 10, 400, 600);
		frame.setLayout(null);
		
		
		JLabel lblUsername = new JLabel("UserName : ");
		lblUsername.setBounds(20, 20, 100, 70);
		
		frame.add(lblUsername);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
