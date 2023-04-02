package com.swing.class5.swinglayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutDemo extends JFrame{
	
	JPanel panel1;
	JPanel panel2;
	
	public CardLayoutDemo() {
		setTitle("Card Layout");
		setBounds(10, 10, 500, 600);
	
		CardLayout cardLayout = new CardLayout();
		
		Container container = getContentPane();
		container.setLayout(cardLayout);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.red);
		
		
		container.add(panel1);
		container.add(panel2);
		
		cardLayout.next(container);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new CardLayoutDemo();
	}
	

}
