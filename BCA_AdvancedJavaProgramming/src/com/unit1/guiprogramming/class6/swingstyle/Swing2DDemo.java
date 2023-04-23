package com.unit1.guiprogramming.class6.swingstyle;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing2DDemo extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		Graphics2D graphics2d = (Graphics2D) g;
		g.drawLine(80, 0, 0, 80);
		//circle
		g.drawOval(0, 150, 30, 30);
		
		//oval
		g.drawOval(0, 220, 30, 10);
		
		int[] x = {100,20,180};
		int[] y = {40,120,120};
		
		g.drawPolygon(x, y, 3);
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("2D");
		
		frame.setBounds(10, 10, 500, 600);
		
		Swing2DDemo  panel = new Swing2DDemo();
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
