package com.liu.other.prop;

import java.util.Properties;

public class PropertiesUtil {
	
	private static final Properties PROPERTIES = new Properties();
	
	public static String getProperties() throws Exception{
		PROPERTIES.load(Object.class.getResourceAsStream("/db.properties"));
		return PROPERTIES.getProperty("mysql.username");
	}
	
}
