package com.wcw.jazzirc.gui;

import java.awt.BorderLayout;

import com.wcw.jazzirc.gui.center.ChatLayout;
import com.wcw.jazzirc.gui.leftlist.ServerLayout;
import com.wcw.jazzirc.gui.rightlist.UserLayout;

public class MainView extends BorderLayout {
	private ServerLayout serverLayout = null;
	
	private UserLayout userLayout = null;
	
	private ServerLayout getServerLayout() {
		if (serverLayout == null) {
			serverLayout = new ServerLayout();
		}
		return serverLayout;
	}
	private UserLayout getUserLayout() {
		if (userLayout == null) {
			userLayout = new UserLayout();
		}
		return userLayout;
	}
	private ChatLayout chatLayout = null;
	private ChatLayout getChatLayout() {
		if (chatLayout == null) {
			chatLayout = new ChatLayout();
		}
		return chatLayout;
	}
}
