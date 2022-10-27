package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import Constants.Constants;
import io.cucumber.core.backend.Options;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    
	
	public static ChromeOptions options;
	//public static DesiredCapabilities capabilities;

	private static WebDriver driver;
	public static void launchBrowser() {
         
		
		switch(Constants.getInstance().getBrowserChosen()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("start-maximized"); DesiredCapabilities capabilities =
			 * new DesiredCapabilities(); capabilities.setBrowserName("Edge");
			 * options.merge(capabilities);
			 */
			driver = new ChromeDriver(options);
            break;
            
		case "Edge" :
            WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
            break;
            
        default:
        	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}		
	}
	public static WebDriver getDriver() {
		return driver;
	}
}
