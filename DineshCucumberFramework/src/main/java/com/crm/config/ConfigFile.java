package com.crm.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {

	
	public Properties pro;
	public  Properties ReadPropertiesFile()  {
		
		 pro = new Properties();
			
			try {
				FileInputStream ip = new FileInputStream("./config.properties");
				pro.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return pro;
			
}
}
