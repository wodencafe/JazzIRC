package com.wcw.jazzirc.gui.center;

import java.awt.BorderLayout;

import javax.swing.JTextArea;

public class ChatLayout extends BorderLayout {
	private JTextArea chatTextArea = null;
	
	public JTextArea getChatTextArea() {
		if (chatTextArea == null) {
			chatTextArea = new JTextArea();
		}
		return chatTextArea;
	}
	
	public ChatLayout() {
		
	}

}
