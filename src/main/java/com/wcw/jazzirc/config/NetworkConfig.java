package com.wcw.jazzirc.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class NetworkConfig {

	private Path basePath = null;
	private String fileName = null;
	private XMLConfiguration config = null;
	private FileBasedConfigurationBuilder<XMLConfiguration> builder = null;
	private static class InnerNetworkConfig {
		private static final NetworkConfig INSTANCE = new NetworkConfig();
	}
	public static void main(String[] args) {
		NetworkConfig.getInstance();
	}
	private NetworkConfig() {
		createConfigFileIfNecessary();

		Parameters params = new Parameters();

		builder =
		    new FileBasedConfigurationBuilder<XMLConfiguration>(XMLConfiguration.class)
		    .configure(params
		    	.xml()
		    	.setBasePath(getBasePath().toString())
		        .setFileName(getFileName()));
		try
		{
			config = builder.getConfiguration();
			//config.addProperty("network", "foo");
			//builder.save();
			
		}
		catch (ConfigurationException cex)
		{
			throw new RuntimeException(cex);
		}
	}
	private void createConfigFileIfNecessary() {
		Path configPath = getBasePath().resolve(getFileName());
		
		if (Files.notExists(configPath)) {
			try {
				Files.createFile(configPath);
				Files.write(configPath, 
					("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>" + System.lineSeparator() +
						"<networks>" + System.lineSeparator() + "</networks>")
					.getBytes());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
		}
	}
	public static final NetworkConfig getInstance() {
		return InnerNetworkConfig.INSTANCE;
	}
	private String getFileName() {
		if (fileName == null) {
			fileName = System.getProperty("jazzirc.config.network.filename", getDefaultFileName());
		}
		return fileName;
	}
	private String getDefaultFileName() {
		return "network.xml";
	}
	private Path getBasePath() {
		if (basePath == null) {
			String basePathString = System.getProperty("jazzirc.config.network.basepath");
			
			if (basePathString == null) {
				basePath = getDefaultBasePath();
			}
			else {
				basePath = Paths.get(basePathString);
			}
			if (!Files.exists(basePath)) {
				try {
					Files.createDirectory(basePath);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		return basePath;
	}
	private Path getDefaultBasePath() {
		String userHome = System.getProperty("user.home");
		
		Path defaultBasePath = Paths.get(userHome).resolve(".jazzirc");
		
		return defaultBasePath;
	}
}
