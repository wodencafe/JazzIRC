package com.wcw.jazzirc.gui.mainmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EditMenu extends JMenu implements ActionListener {

	private JMenuItem findTextItem = null;
	private JMenuItem findNextItem = null;
	private JMenuItem findPreviousItem = null;
	private JMenuItem clearMarkerLinesItem = null;
	private JMenuItem enlargeFontSizeItem = null;
	private JMenuItem decreaseFontSizeItem = null;
	private JMenuItem resetFontSizeItem = null;
	private JMenuItem clearWindowItem = null;
	private JMenuItem clearAllWindowsItem = null;
	public EditMenu() {

		super("Edit");
		add(getFindTextItem());
		add(getFindNextItem());
		add(getFindPrevioustItem());
		addSeparator();
		add(getClearLineMarkersItem());
		addSeparator();
		add(getEnlargeFontSizeItem());
		add(getDecreaseFontSizeItem());
		add(getResetFontSizeItem());
		addSeparator();
		add(getClearWindowItem());
		add(getClearAllWindowsItem());
	}
	public JMenuItem getFindTextItem() {
		if (findTextItem == null) {
			findTextItem = new JMenuItem("Find Text...");
		}
		return findTextItem;
	}
	public JMenuItem getFindNextItem() {
		if (findNextItem == null) {
			findNextItem = new JMenuItem("Find Next");
		}
		return findNextItem;
	}
	public JMenuItem getFindPrevioustItem() {
		if (findPreviousItem == null) {
			findPreviousItem = new JMenuItem("Find Previous");
		}
		return findPreviousItem;
	}
	public JMenuItem getClearLineMarkersItem() {
		if (clearMarkerLinesItem == null) {
			clearMarkerLinesItem = new JMenuItem("Clear Marker Lines");
		}
		return clearMarkerLinesItem;
	}
	public JMenuItem getEnlargeFontSizeItem() {
		if (enlargeFontSizeItem == null) {
			enlargeFontSizeItem = new JMenuItem("Enlarge Font Size");
		}
		return enlargeFontSizeItem;
	}
	public JMenuItem getDecreaseFontSizeItem() {
		if (decreaseFontSizeItem == null) {
			decreaseFontSizeItem = new JMenuItem("Decrease Font Size");
		}
		return decreaseFontSizeItem;
	}
	public JMenuItem getResetFontSizeItem() {
		if (resetFontSizeItem == null) {
			resetFontSizeItem = new JMenuItem("Reset Font Size");
		}
		return resetFontSizeItem;
	}
	public JMenuItem getClearWindowItem() {
		if (clearWindowItem == null) {
			clearWindowItem = new JMenuItem("Clear Window");
		}
		return clearWindowItem;
	}
	public JMenuItem getClearAllWindowsItem() {
		if (clearAllWindowsItem == null) {
			clearAllWindowsItem = new JMenuItem("Clear All Windows");
		}
		return clearAllWindowsItem;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
