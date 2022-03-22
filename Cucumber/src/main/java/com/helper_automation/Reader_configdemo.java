package com.helper_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reader_configdemo {
	//properties classname; create pannanum
	public Properties p; // ---null
	// public classname refname;
	
	public Reader_configdemo() throws Throwable {
		File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\Environment_setup\\src\\main\\java\\com\\sdppp\\Configuredemo.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		p.load(fis);
		
		
		
	}
	
	
	public String geturl() throws IOException {
		
		
		String propurl = p.getProperty("url");
		return propurl;
		
		

	}
	public String getusername() {
		String user = p.getProperty("username");
		return user;

	}
	public String getpasswd() {
		String passwd = p.getProperty("password");
		return passwd;

	}

}
