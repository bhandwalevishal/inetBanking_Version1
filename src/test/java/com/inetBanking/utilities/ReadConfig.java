package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
           Properties Pro;
           public ReadConfig()
           {
        	File src=new File("./Configuration/config.properties");   
        
				FileInputStream fis = null;
				try {
					fis = new FileInputStream(src);
			    	} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				                                      }
			    Pro =new Properties();
			    try {
					Pro.load(fis);
			    	} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				                            }
            }
       	public String getApplicationURL()
	    {
		    String url=Pro.getProperty("baseUrl");
		    return url;
	    }
       	
        public String getUsername()
        {
        	String username=Pro.getProperty("username");
        	return username;
        }
        
        public String getPassword()
        {
            String password=Pro.getProperty("password");
            return password;
        }
        
        public String getChromePath()
        {
        	String chromepath=Pro.getProperty("chromepath");
        	return chromepath;
        }
        
        public String getFireFoxPath()
        {
        	String firefoxpath=Pro.getProperty("firefoxpath");
        	return firefoxpath;
        }
        
}
