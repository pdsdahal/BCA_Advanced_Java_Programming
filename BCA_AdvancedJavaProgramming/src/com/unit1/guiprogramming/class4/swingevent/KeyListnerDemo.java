package com.unit1.guiprogramming.class4.swingevent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyListnerDemo extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JLabel lblNum1, lblResult;
	JTextField txtNum1, txtResult;
	
	public KeyListnerDemo() {
		setTitle("Key Event");
		setLayout(null);
		setBounds(10, 10, 500, 600);
		
		lblNum1 = new JLabel("Num1 : ");
		lblNum1.setBounds(10, 10, 100, 50);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(120, 10, 100, 50);
		
		
		lblResult = new JLabel("Result : ");
		lblResult.setBounds(10, 130, 100, 50);
		
		txtResult = new JTextField();
		txtResult.setBounds(120, 130, 100, 50);
		
		add(lblNum1);
		add(txtNum1);
		add(lblResult);
		add(txtResult);
		
		
		txtNum1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				txtResult.setText(txtNum1.getText().toUpperCase());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Released");
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Pressed");
				
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new KeyListnerDemo();
	}
		

}
