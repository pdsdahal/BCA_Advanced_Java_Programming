package com.swing.class6.swingstyle;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayImageDemo extends  JFrame {
	
	JLabel customerName;
	
	public DisplayImageDemo() {
		setTitle("Display Image");
		setBounds(10, 10, 400, 500);
		
		Container container = getContentPane();
		
		
		ImageIcon imageIcon = new ImageIcon("F:\\AdvancedJavaProgrammingTexas-BCA-6\\logo.jpg");
		//custom 
		Image treeImage = imageIcon.getImage();
		Image modifiedImage = treeImage.getScaledInstance(100, 50, Image.SCALE_SMOOTH);
		ImageIcon resultImage = new ImageIcon(modifiedImage);
		
		customerName = new JLabel(resultImage);
		
		container.add(customerName);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new DisplayImageDemo();
	}
}
