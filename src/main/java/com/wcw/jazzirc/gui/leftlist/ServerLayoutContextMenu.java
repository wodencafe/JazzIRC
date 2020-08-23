package com.wcw.jazzirc.gui.leftlist;

import java.awt.MenuItem;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class ServerLayoutContextMenu extends JPopupMenu {

	private ServerLayoutMediator serverLayoutMediator;
	public ServerLayoutContextMenu(ServerLayoutMediator serverLayoutMediator) {
		this.serverLayoutMediator = serverLayoutMediator;
		add(getEnableNotificationsMenuItem());
		add(getJoinOnConnectMenuItem());
		add(getSetEncodingMenuItem());
		addSeparator();
		add(getMoveTabUpMenuItem());
		add(getMoveTabDownMenuItem());
		add(getCloseTabMenuItem());
		
	}
	private JCheckBoxMenuItem enableNotificationsMenuItem;
	
	private JCheckBoxMenuItem getEnableNotificationsMenuItem() {
		if (enableNotificationsMenuItem == null) {
			enableNotificationsMenuItem = new JCheckBoxMenuItem("Enable Notifications");
		}
		return enableNotificationsMenuItem;
	}	
	private JCheckBoxMenuItem joinOnConnectMenuItem;
	
	private JCheckBoxMenuItem getJoinOnConnectMenuItem() {
		if (joinOnConnectMenuItem == null) {
			joinOnConnectMenuItem = new JCheckBoxMenuItem("Join on Connect");
		}
		return joinOnConnectMenuItem;
	}
	private JMenuItem setEncodingMenuItem;
	
	private JMenuItem getSetEncodingMenuItem() {
		if (setEncodingMenuItem == null) {
			setEncodingMenuItem = new JMenuItem("Set Encoding");
		}
		return setEncodingMenuItem;
	}
	private JMenuItem moveTabUpMenuItem = null;
	private JMenuItem moveTabDownMenuItem = null;
	private JMenuItem closeTabMenuItem = null;
	private JMenuItem getMoveTabUpMenuItem() {
		if (moveTabUpMenuItem == null) {
			moveTabUpMenuItem = new JMenuItem("Move Tab Up");
		}
		return moveTabUpMenuItem;
	}
	private JMenuItem getMoveTabDownMenuItem() {
		if (moveTabDownMenuItem == null) {
			moveTabDownMenuItem = new JMenuItem("Move Tab Down");
		}
		return moveTabDownMenuItem;
	}
	private JMenuItem getCloseTabMenuItem() {
		if (closeTabMenuItem == null) {
			closeTabMenuItem = new JMenuItem("Close Tab");
		}
		return closeTabMenuItem;
	}
}
