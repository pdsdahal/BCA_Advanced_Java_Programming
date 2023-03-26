package com.swing.class2;

import javax.swing.*;

public class CheckBoxRadioButtonDemo extends JFrame {

	JLabel lblLanuage, lblGender;
	JCheckBox chkEnglish, chkNepali,chkOther;
	JRadioButton btnMale, btnFemale, btnOther;
	ButtonGroup btnGroup;
	
	JLabel lblCountry;
	JComboBox<String> cmBoxcountyName;
	
	
	public CheckBoxRadioButtonDemo() {
		setTitle("CheckBox and Radio Button");
		setBounds(10, 10, 600, 500);
		setLayout(null);
		
		lblLanuage = new JLabel("Language : ");
		lblLanuage.setBounds(10, 30, 100, 70);
		
		chkEnglish = new JCheckBox("English");
		chkEnglish.setBounds(120, 30, 100, 70);

		chkNepali = new JCheckBox("Nepali");
		chkNepali.setBounds(230, 30, 100, 70);

		chkOther = new JCheckBox("Other");
		chkOther.setBounds(340, 30, 100, 70);
		
		lblGender = new JLabel("Gender : ");
		lblGender.setBounds(10, 140, 100, 70);

		btnMale = new JRadioButton("Male");
		btnMale.setBounds(120, 140, 100, 70);

		btnFemale = new JRadioButton("FeMale");
		btnFemale.setBounds(230, 140, 100, 70);

		btnOther = new JRadioButton("Others");
		btnOther.setBounds(340, 140, 100, 70);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(btnMale);
		btnGroup.add(btnFemale);
		btnGroup.add(btnOther);
		
		
		lblCountry = new JLabel("Country : ");
		lblCountry.setBounds(10, 220, 100, 70);
		
		String[] data = {"Nepal","China","US"};
		cmBoxcountyName = new JComboBox<>(data);
		cmBoxcountyName.setBounds(120, 225, 100, 40);
		
		
		
		
		add(lblCountry);
		add(cmBoxcountyName);
		add(lblLanuage);
		add(chkEnglish);
		add(chkNepali);
		add(chkOther);
		add(lblGender);
		add(btnMale);
		add(btnFemale);
		add(btnOther);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new CheckBoxRadioButtonDemo();
	}

	
	
}
