package com.swing.class6.view;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtResult;
	JButton btnClick;
	Container container;

	public View() {

		setTitle("Swing MVC Demo");
		setBounds(10, 10, 300, 200);
		container = getContentPane();
		container.setLayout(new FlowLayout(20, 20, 20));

		txtResult = new JTextField(20);

		btnClick = new JButton("Click Me...");

		container.add(txtResult);
		container.add(btnClick);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public JButton getButtonClick() {
		return btnClick;
	}
	
	public JTextField getTextField() {
		return txtResult;
	}
	
	
}
