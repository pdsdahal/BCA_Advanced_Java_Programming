package com.swing.class6.swingstyle;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorDemo extends  JFrame {
	
	JLabel customerName;
	
	public ColorDemo() {
		setTitle("Font Demo");
		setBounds(10, 10, 400, 500);
		
		
		Container container = getContentPane();
		container.setBackground(Color.GREEN);

		
		Color color = new Color(255, 0, 0);
		
		customerName = new JLabel("Ram Panday");
		customerName.setBackground(color);
		customerName.setOpaque(true);
		
		container.add(customerName);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new ColorDemo();
	}
}
