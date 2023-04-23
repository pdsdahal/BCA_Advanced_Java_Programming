package com.unit1.guiprogramming.class3.swingcomponents;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuDemo extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public JMenuDemo() {
		setTitle("JMenu Demo");
		setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10,10,500,60);
		
		JMenu fileMenu = new JMenu("File");

		JMenu newMenu = new JMenu("New");
		
		JMenuItem javaProjectMenu = new JMenuItem("Java Project");
		newMenu.add(javaProjectMenu);
		
		JMenuItem openMenu = new JMenuItem("Open...");
		JMenuItem exitMenu = new JMenuItem("Exit");
		
		fileMenu.add(newMenu);
		fileMenu.add(openMenu);
		fileMenu.add(exitMenu);
		
		
		JMenu editMenu = new JMenu("Edit");
		JMenu sourceMenu = new JMenu("Source");

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(sourceMenu);
		
		add(menuBar);
		setBounds(10, 10, 500, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JMenuDemo();
	}
	
}
