package com.wcw.jazzirc.gui.mainmenu;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class InsertMenu extends JMenu implements ActionListener {
	private JMenuItem ircColorItem = null;
	
	private JMenuItem markerLineItem = null;
	
	private JMenuItem specialCharacterItem = null;

	public InsertMenu() {
		super("Insert");
		add(getIrcColorItem());
		add(getMarkerLineItem());
		add(getSpecialCharacterItem());
	}
	private JMenuItem getIrcColorItem() {
		if (ircColorItem == null) {
			ircColorItem = new JMenuItem("IRC Color...");
			ircColorItem.setAccelerator(KeyStroke.getKeyStroke('K', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
		}
		return ircColorItem;
	}
	private JMenuItem getMarkerLineItem() {
		if (markerLineItem == null) {
			markerLineItem = new JMenuItem("Marker Line Item");
		}
		return markerLineItem;
	}
	private JMenuItem getSpecialCharacterItem() {
		if (specialCharacterItem == null) {
			specialCharacterItem = new JMenuItem("Special Character...");
		}
		return specialCharacterItem;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
