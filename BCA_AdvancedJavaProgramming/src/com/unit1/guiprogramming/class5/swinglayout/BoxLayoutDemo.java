package com.unit1.guiprogramming.class5.swinglayout;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BoxLayoutDemo extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JLabel lblUserName, lblPassword;
	JTextField txtUserName;
	JPasswordField txtPassword;

	public BoxLayoutDemo() {

		setTitle("Box Layout");
		setBounds(10, 10, 400, 200);

		Container container = getContentPane();
		BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(boxLayout);

		lblUserName = new JLabel("UserName : ");
		txtUserName = new JTextField(20);

		lblPassword = new JLabel("Password : ");
		txtPassword = new JPasswordField(20);

		container.add(lblUserName);
		container.add(txtUserName);
		container.add(lblPassword);
		container.add(txtPassword);

		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BoxLayoutDemo();
	}
}
