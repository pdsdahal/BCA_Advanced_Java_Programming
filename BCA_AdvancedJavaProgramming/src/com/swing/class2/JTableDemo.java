package com.swing.class2;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo extends JFrame {
	
	JTable tblStudent;
	
	JList<String> menuList;
	
	
	public JTableDemo() {
		
		setTitle("Table Demo");
		setBounds(10, 10, 500, 700);
		setLayout(null);
		
		
		String[] columnName = {"Id","Name","Class"};
		Object[][] datas = {{1,"Ram", 11},{2,"Shyam",12},{3,"Rita", 10}};
		
		tblStudent = new JTable(datas, columnName);
		
		JScrollPane pane = new JScrollPane(tblStudent);
		pane.setBounds(10, 10, 400, 60);
		

		String[] menu = {"Home","About Us","EXtra"};
		menuList = new JList<>(menu);
		menuList.setBounds(10, 80, 100, 100);
		
		
		add(pane);
		add(menuList);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new JTableDemo();
	}

}
