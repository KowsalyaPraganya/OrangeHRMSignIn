package Constants;

public class Constants {
	 
	public static Constants ConstantsInstance  = null;
	private Constants()
	{
	
	}
	public static Constants getInstance()
	{   if(ConstantsInstance == null)
	{
		ConstantsInstance = new Constants();
	}
		return ConstantsInstance;
		
	}
	
	private String APP_URL;
	private String password;
	private String Username;
	private String browserChosen;
	public  String getAPP_URL() {
		return APP_URL;
	}
	public String getPassword() {
		return password;
	}
	public String getUsername() {
		return Username;
	}
	public String getBrowserChosen() {
		return browserChosen;
	}
	public  void setAPP_URL(String APP_URL) {
		this.APP_URL = APP_URL;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public void setBrowserChosen(String browserChosen) {
		this.browserChosen = browserChosen;
	}
}
