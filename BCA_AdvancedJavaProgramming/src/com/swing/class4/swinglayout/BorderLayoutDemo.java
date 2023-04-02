package com.swing.class4.swinglayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayoutDemo extends JFrame {
	
	JLabel lblNum1, lblNum2, lblNum3, lblNum4, lblNum5;
	
	public BorderLayoutDemo() {
		setTitle("Border Layout");
		setBounds(10, 10, 400, 500);
	
		Container container =  getContentPane();
		container.setLayout(new BorderLayout(5,5));
		
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.red);
		lblNum1 = new JLabel("Num 1: ");
		eastPanel.add(lblNum1);
		
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.green);
		lblNum2 = new JLabel("Num 2: ");
		westPanel.add(lblNum2);
		
		
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.gray);
		lblNum3 = new JLabel("Num 3: ");
		northPanel.add(lblNum3);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.BLUE);
		lblNum4 = new JLabel("Num 4: ");
		southPanel.add(lblNum4);
		
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.CYAN);
		lblNum5 = new JLabel("Num 5: ");
		centerPanel.add(lblNum5);
		
		container.add(northPanel, BorderLayout.NORTH);
		container.add(eastPanel, BorderLayout.EAST);
		container.add(westPanel, BorderLayout.WEST);
		container.add(southPanel, BorderLayout.SOUTH);
		container.add(centerPanel, BorderLayout.CENTER);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
	

}
