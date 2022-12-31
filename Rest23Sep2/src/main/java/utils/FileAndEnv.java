package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnv {
	
	public static Map<String,String> fileEnv=new HashMap<String,String>();
	public static Properties propMain =new Properties();
	public static Properties propPreSet =new Properties();
	
	public static Map<String,String> envAndFile (){
		String environment =System.getProperty("env");
		
		try {
			if(environment.equalsIgnoreCase("dev")) {
				FileInputStream fisDev=new FileInputStream(System.getProperty("user.dir")+"/inputs/dev.properties");
				propMain.load(fisDev);
				fileEnv.put("serverUrl", propMain.getProperty("serverUrl"));
				fileEnv.put("port", propMain.getProperty("port"));
				fileEnv.put("username", propMain.getProperty("username"));
				fileEnv.put("password", propMain.getProperty("password"));
				
				
			}
			else if(environment.equals("qa")) {
				FileInputStream fisQa=new FileInputStream(System.getProperty("user.dir")+"/inputs/qa.properties");
				propMain.load(fisQa);
				fileEnv.put("serverUrl", propMain.getProperty("serverUrl"));
				fileEnv.put("port", propMain.getProperty("port"));
				fileEnv.put("username", propMain.getProperty("username"));
				fileEnv.put("password", propMain.getProperty("password"));
				
				
			}
			else if(environment.equals("staging")) {
				FileInputStream fisStaging=new FileInputStream(System.getProperty("user.dir")+"/inputs/staging.properties");
				propMain.load(fisStaging);
				fileEnv.put("serverUrl", propMain.getProperty("serverUrl"));
				fileEnv.put("port", propMain.getProperty("port"));
				fileEnv.put("username", propMain.getProperty("username"));
				fileEnv.put("password", propMain.getProperty("password"));
				
				
			}
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		return fileEnv;
		
	}
	
	public static Map<String,String> getConfigReader(){
		
		if(fileEnv==null) {
			fileEnv=envAndFile();
		}
		return fileEnv;
	}

}
