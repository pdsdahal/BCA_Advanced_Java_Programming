package com.swing.class6.swingstyle;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontDemo extends  JFrame {
	
	JLabel customerName;
	
	public FontDemo() {
		setTitle("Font Demo");
		setBounds(10, 10, 400, 500);
		
		Font font = new Font(Font.SANS_SERIF, Font.BOLD | Font.ITALIC, 20);
		customerName = new JLabel("Ram Panday");
		customerName.setFont(font);
		
		
		add(customerName);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new FontDemo();
	}
}
