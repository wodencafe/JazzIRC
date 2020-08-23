package com.wcw.jazzirc.config;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Network {
	private String name;
	
	private UUID id;
	
	private List<Channel> channelList = new ArrayList<>();
	
	private boolean connected;
	
	private boolean connectOnStartup;
	
	private List<Server> servers = new ArrayList<>();
	
	private String commands;
	
	private UUID associatedIdentityId;
}
