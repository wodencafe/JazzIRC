package com.wcw.jazzirc.gui.rightlist;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class UserLayoutContextMenu extends JPopupMenu {

	private JMenuItem openQueryMenuItem = null;
	private JMenuItem whoisMenuItem = null;
	private JMenuItem versionMenuItem = null;
	private JMenuItem pingMenuItem = null;
	private JMenuItem modesMenuItem = null;
	private JMenuItem kickBanMenuItem = null;
	private JMenuItem quickButtonsMenuItem = null; 
	private JMenuItem ignoreMenuItem = null;
	private JMenuItem addToWatchedNicksMenuItem = null;
	private JMenuItem sendFileMenuItem = null;
	private JMenuItem openDccChatMenuItem = null;
	private JMenuItem openDccWhiteboardMenuItem = null;
	private UserLayoutMediator userLayoutMediator = null;
	public UserLayoutContextMenu(UserLayoutMediator userLayoutMediator) {
		this.userLayoutMediator = userLayoutMediator;
	}
}
