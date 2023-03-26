package com.swing.class2;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JOptionPaneDemo extends JFrame {
	

	public JOptionPaneDemo() {
		
		setTitle("Table Demo");
		setBounds(10, 10, 500, 700);
		setLayout(null);
		
		JOptionPane.showMessageDialog(this, "Are you okay?");
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new JOptionPaneDemo();
	}

	
}
