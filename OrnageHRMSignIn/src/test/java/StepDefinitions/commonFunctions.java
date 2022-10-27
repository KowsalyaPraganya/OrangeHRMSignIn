package StepDefinitions;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import Constants.Constants;
import DriverManager.DriverManager;
import commonUtils.CommonUtils;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class commonFunctions {
	@Before
	public void beforeScenario() throws IOException
	{
	 CommonUtils commonUtils = new CommonUtils();
     commonUtils.loadProperties();
     if(DriverManager.getDriver() == null)
     {
     DriverManager.launchBrowser();
     CommonUtils.initializeInitElements();
     }
     
	}

	
	}

