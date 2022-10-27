package commonUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import Constants.Constants;
import DriverManager.DriverManager;
import pageObjects.loginPageObjetcs;
public class CommonUtils {
	
	public void loadProperties() throws IOException
	{
		

	    Properties properties = new Properties();
	    try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		Constants.getInstance().setAPP_URL(properties.getProperty("APP_URL"));
		Constants.getInstance().setUsername(properties.getProperty("Username"));
		Constants.getInstance().setPassword(properties.getProperty("password"));
		Constants.getInstance().setBrowserChosen(properties.getProperty("browserChosen"));
	}
	public static void initializeInitElements() {
  
		PageFactory.initElements(DriverManager.getDriver(), loginPageObjetcs.getInstance());
	}
     
}
