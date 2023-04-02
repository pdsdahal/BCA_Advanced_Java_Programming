package com.swing.class5.swinglayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridBgLayoutDemo extends JFrame {

	JLabel lblFirstName, lblLastName;
	JTextField txtFirstName, txtLastName;
	
	public GridBgLayoutDemo() {
		setTitle("GridBag Layout");
		setBounds(10, 10, 600, 700);
	
		GridBagLayout gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);

		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		lblFirstName = new JLabel("First Name : ");
		add(lblFirstName, gbc);
		
		
		txtFirstName = new JTextField(20);
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(txtFirstName, gbc);
		
		lblLastName = new JLabel("Last Name : ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(lblLastName, gbc);
		
		txtLastName = new JTextField(20);
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(txtLastName, gbc);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new GridBgLayoutDemo();
	}
	
}
