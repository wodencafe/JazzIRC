package com.wcw.jazzirc.gui.mainmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class WindowMenu extends JMenu implements ActionListener {

	private JMenuItem previousTabItem = null;
	
	private JMenuItem nextTabItem = null;
	
	private JMenuItem nextActiveTabItem = null;
	
	private JMenuItem moveTabUpItem = null;
	
	private JMenuItem moveTabDownItem = null;
	
	private JMenuItem closeTabItem = null;
	
	private JMenuItem closeAllOpenQueriesItem = null;
	
	private JCheckBoxMenuItem enableNotificationsItem = null;
	
	private JMenuItem setEncodingItem = null;
	
	private JCheckBoxMenuItem watchedNicksItem = null;
	
	private JCheckBoxMenuItem urlCatcherItem = null;
	
	private JMenuItem newCmdLineItem = null;
	
	private JMenuItem channelListItem = null;
	
	private JMenuItem openLogItem = null;
	
	private JMenuItem channelSettingsItem = null;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
