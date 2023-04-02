package com.swing.class4.swingevent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MouseListnerDemo extends JFrame {
	
	JLabel lblNum1, lblNum2, lblResult;
	JTextField txtNum1, txtNum2, txtResult;
	
	public MouseListnerDemo() {
		setTitle("Mouse Event");
		setLayout(null);
		setBounds(10, 10, 500, 600);
		
		lblNum1 = new JLabel("Num1 : ");
		lblNum1.setBounds(10, 10, 100, 50);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(120, 10, 100, 50);
		
		lblNum2 = new JLabel("Num2 : ");
		lblNum2.setBounds(10, 70, 100, 50);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(120, 70, 100, 50);
		
		lblResult = new JLabel("Result : ");
		lblResult.setBounds(10, 130, 100, 50);
		
		txtResult = new JTextField();
		txtResult.setBounds(120, 130, 100, 50);
		
		add(lblNum1);
		add(txtNum1);
		add(lblNum2);
		add(txtNum2);
		add(lblResult);
		add(txtResult);
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int sub = num1 - num2;
				
				txtResult.setText(""+sub);
	
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int add = num1 + num2;
				
				txtResult.setText(""+add);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new MouseListnerDemo();
	}
}
