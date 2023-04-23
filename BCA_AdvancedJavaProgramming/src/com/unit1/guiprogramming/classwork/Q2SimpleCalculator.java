package com.unit1.guiprogramming.classwork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Q2SimpleCalculator extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JLabel lblNum1, lblNum2, lblResult;
	JTextField txtNum1, txtNum2;
	JButton btnAdd, btnSub, btnDiv, btnMul;
	
	public Q2SimpleCalculator() {
		setTitle("Q2. Simple Calculator");
		setBounds(10, 10, 600, 700);
		setLayout(null);
		lblNum1 = new JLabel("Num1 : ");
		lblNum1.setBounds(10, 10, 100, 50);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(110, 10, 200, 50);

		lblNum2 = new JLabel("Num2 : ");
		lblNum2.setBounds(10, 60, 100, 50);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(110, 60, 200, 50);
		
		btnAdd = new JButton(" + ");
		btnAdd.setActionCommand("Add");
		btnAdd.setBounds(10, 120, 50, 50);
		btnAdd.addActionListener(this);
		
		btnSub = new JButton(" - ");
		btnSub.setBounds(70, 120, 50, 50);
		btnSub.addActionListener(this);
		btnSub.setActionCommand("Sub");
		
		btnDiv = new JButton(" / ");
		btnDiv.setBounds(130, 120, 50, 50);
		
		btnMul = new JButton(" * ");
		btnMul.setBounds(190, 120, 50, 50);
		
		lblResult = new JLabel("Result : ");
		lblResult.setBounds(10, 180, 200, 100);
		
		
		add(lblNum1);
		add(txtNum1);
		add(lblNum2);
		add(txtNum2);
		add(btnAdd);
		add(btnSub);
		add(btnDiv);
		add(btnMul);
		add(lblResult);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
	
		new Q2SimpleCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String name = e.getActionCommand();
		
		int num1 = Integer.parseInt(txtNum1.getText());
		int num2 = Integer.parseInt(txtNum2.getText());
		int result = 0;
		
		if(name.equals("Add")) {
			result = num1 + num2;
			lblResult.setText("Resutlt : "+num1+ " + "+num2 + " = "+result);
		}else if(name.equals("Sub")) {
			result = num1 - num2;
			lblResult.setText("Resutlt : "+num1+ " - "+num2 + " = "+result);
		}
		
	}
}
