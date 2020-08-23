package com.wcw.jazzirc.gui.mainmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FileMenu extends JMenu implements ActionListener {
	private JMenuItem serverListItem = null;
	private JMenuItem quickConnectItem = null;
	private JMenuItem disconnectItem = null;
	private JMenuItem reconnectItem = null;
	private JMenuItem joinChannelItem = null;
	private JMenuItem quitItem = null;
	private JMenuItem globalAwayItem = null;
	public FileMenu() {
		super("File");

		add(getServerListItem());
		add(getQuickConnectItem());
		addSeparator();
		add(getDisconnectItem());
		add(getReconnectItem());
		add(getJoinChannelItem());
		addSeparator();
		add(getGlobalAwayItem());
		addSeparator();
		add(getQuitItem());
		
	}
	private JMenuItem getJoinChannelItem() {
		if (joinChannelItem == null) {
			joinChannelItem = new JMenuItem("Join Channel...");
		}
		return joinChannelItem;
	}
	private JMenuItem getServerListItem() {
		if (serverListItem == null) {
			serverListItem = new JMenuItem("Server List...");
		}
		return serverListItem;
	}
	private JMenuItem getQuickConnectItem() {
		if (quickConnectItem == null) {
			quickConnectItem = new JMenuItem("Quick Connect...");
		}
		return quickConnectItem;
	}
	private JMenuItem getDisconnectItem() {
		if (disconnectItem == null) {
			disconnectItem = new JMenuItem("Disconnect");
		}
		return disconnectItem;
	}
	private JMenuItem getReconnectItem() {
		if (reconnectItem == null) {
			reconnectItem = new JMenuItem("Reconnect");
		}
		return reconnectItem;
	}
	private JMenuItem getQuitItem() {
		if (quitItem == null) {
			quitItem = new JMenuItem("Quit");
		}
		return quitItem;
	}
	private JMenuItem getGlobalAwayItem() {
		if (globalAwayItem == null) {
			globalAwayItem = new JMenuItem("Set Global Away");
		}
		return globalAwayItem;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
