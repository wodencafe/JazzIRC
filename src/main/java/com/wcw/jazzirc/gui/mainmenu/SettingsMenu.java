package com.wcw.jazzirc.gui.mainmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class SettingsMenu extends JMenu implements ActionListener {

	private JCheckBoxMenuItem showNicklistItem;
	
	private JCheckBoxMenuItem showMenubarItem;
	
	private JCheckBoxMenuItem showToolbarItem;
	
	private JCheckBoxMenuItem showStatusbarItem;
	
	private JMenuItem identitiesItem;
	
	private JMenuItem configureKeyboardShortcutsItem;
	
	private JMenuItem configureToolbarsItem;
	
	private JMenuItem configureNotificationsItem;
	
	private JMenuItem configureJazzIRCItem;
	
	public SettingsMenu() {
		super("Settings");
		add(getShowNicklistItem());
		addSeparator();
		add(getShowMenubarItem());
		add(getShowToolbarItem());
		add(getShowStatusbarItem());
		addSeparator();
		add(getIdentitiesItem());
		addSeparator();
		add(getConfigureKeyboardShortcutsItem());
		add(getConfigureToolbarsItem());
		add(getConfigureNotificationsItem());
		add(getConfigureJazzIRCItem());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public JCheckBoxMenuItem getShowNicklistItem() {
		if (showNicklistItem == null) { 
			showNicklistItem = new JCheckBoxMenuItem("Show Nicklist");
		}
		return showNicklistItem;
	}
	public JCheckBoxMenuItem getShowMenubarItem() {
		if (showMenubarItem == null) {
			showMenubarItem = new JCheckBoxMenuItem("Show Menubar");
		}
		return showMenubarItem;
	}
	public JCheckBoxMenuItem getShowToolbarItem() {
		if (showToolbarItem == null) {
			showToolbarItem = new JCheckBoxMenuItem("Show Toolbar");
		}
		return showToolbarItem;
	}
	public JCheckBoxMenuItem getShowStatusbarItem() {
		if (showStatusbarItem == null) {
			showStatusbarItem = new JCheckBoxMenuItem("Show Statusbar");
		}
		return showStatusbarItem;
	}
	public JMenuItem getIdentitiesItem() {
		if (identitiesItem == null) {
			identitiesItem = new JMenuItem("Identities...");
		}
		return identitiesItem;
	}
	public JMenuItem getConfigureKeyboardShortcutsItem() {
		if (configureKeyboardShortcutsItem == null) {
			configureKeyboardShortcutsItem = new JMenuItem("Configure Keyboard Shortcuts...");
		}
		return configureKeyboardShortcutsItem;
	}
	public JMenuItem getConfigureToolbarsItem() {
		if (configureToolbarsItem == null) {
			configureToolbarsItem = new JMenuItem("Configure Toolbars...");
		}
		return configureToolbarsItem;
	}
	public JMenuItem getConfigureNotificationsItem() {
		if (configureNotificationsItem == null) {
			configureNotificationsItem = new JMenuItem("Configure Notifications...");
		}
		return configureNotificationsItem;
	}
	public JMenuItem getConfigureJazzIRCItem() {
		if (configureJazzIRCItem == null) {
			configureJazzIRCItem = new JMenuItem("Configure JazzIRC...");
		}
		return configureJazzIRCItem;
	}
	

}
