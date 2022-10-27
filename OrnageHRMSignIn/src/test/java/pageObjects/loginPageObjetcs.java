package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageObjetcs {
	
	private static loginPageObjetcs loginPageObjetcsInstance = null;
	private loginPageObjetcs()
	{
		
	}
	public static loginPageObjetcs getInstance()
	{   
		if(loginPageObjetcsInstance == null)
	    {  
		loginPageObjetcsInstance = new loginPageObjetcs();
	    }
		return loginPageObjetcsInstance;
		
	}
	@FindBy(xpath = "//input[@id ='username']")
	private  WebElement userName;
	@FindBy(xpath = "//input[@id ='password']")
	private WebElement passWord;
	@FindBy(xpath = "//button[@id ='submit']")
    private WebElement loginButton;
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
}
