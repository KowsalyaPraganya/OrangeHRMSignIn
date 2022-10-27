package StepDefinitions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Constants.Constants;
import DriverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.loginPageObjetcs;
public class signIn_stepDefinitions {
	
	
	@Given("user is on Login page")
	public void user_is_on_login_page() throws IOException {
	   DriverManager.getDriver().get(Constants.getInstance().getAPP_URL());
	    
	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() throws IOException {
		
	    loginPageObjetcs.getInstance().getUserName().sendKeys(Constants.getInstance().getUsername());
		loginPageObjetcs.getInstance().getPassWord().sendKeys(Constants.getInstance().getPassword());
		}

	@When("clicks login button")
	public void clicks_login_button() {
		loginPageObjetcs.getInstance().getLoginButton().click();
	}
	@Then("user should be logged in")
	public void user_should_be_logged_in() {
	   System.out.println("successfully logged in");
	}


}
