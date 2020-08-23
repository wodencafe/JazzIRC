package com.wcw.jazzirc.config;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Identity {
	private UUID id;
	
	private String name;
	
	private String realName;
	
	private List<String> nickNames = new ArrayList<>();
	
	private IdentifyType identifyType;
	
	private String identifyService;
	
	private String identifyCommand;
	
	private String identifyPassword;
	
	private String saslAccount;
	
	private String saslPassword;
	
	private boolean markLastChatPositionAway;
	
	private String defaultAwayMessage;
	
	private String awayNickname;
	
	private boolean autoAway;
	
	private int autoAwayMinutes;
	
	private boolean autoAwayReturn;
	
	private boolean awayCommands;
	
	private String awayCommand;
	
	private String returnCommand;
	
	private String preShellCommand;
	
	private String encoding;
	
	private String ident;
	
	private String quitReason;
	
	private String partReason;
	
	private String kickReason;
}
