package com.unit1.guiprogramming.class5.swinglayout;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GroupLayoutDemo extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JLabel lblUserName, lblPassword;
	JTextField txtUserName;
	JPasswordField txtPassword;

	public GroupLayoutDemo() {
		
		setTitle("Group Layout");
		setBounds(10, 10, 300, 200);
		
		lblUserName = new JLabel("UserName : ");
		txtUserName = new JTextField(20);
		
		lblPassword = new JLabel("Password : ");
		txtPassword = new JPasswordField(20);
		
		Container container = getContentPane();
		GroupLayout layout = new GroupLayout(container);
		container.setLayout(layout);
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
		        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		                .addComponent(lblUserName)
		                .addComponent(lblPassword))
		        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		                .addComponent(txtUserName)
		                .addComponent(txtPassword))
		);

		layout.setVerticalGroup(layout.createSequentialGroup()
		        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
		                .addComponent(lblUserName)
		                .addComponent(txtUserName))
		        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
		                .addComponent(lblPassword)
		                .addComponent(txtPassword))
		);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new GroupLayoutDemo();
	}
}
