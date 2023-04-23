package com.unit1.guiprogramming.class2.swingcomponent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneDemo extends JFrame {
	private static final long serialVersionUID = 1L;
	

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
