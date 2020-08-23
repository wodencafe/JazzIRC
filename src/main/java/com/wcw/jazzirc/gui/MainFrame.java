package com.wcw.jazzirc.gui;

import javax.swing.JFrame;

public class MainFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new MainView());
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
}
