package ultilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	static private Properties config;  
	
	static {
		String path="./src/test/resources/test_data/configuration.properties";
		try {
			FileInputStream input=new FileInputStream(path);
			config=new Properties();
			config.load(input);
			input.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getProperty (String keys) {
		return config.getProperty(keys);
	}
}
