package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//header//a[@href='/account/login']")
	WebElement login;
	
	@FindBy(xpath="//input[@id='CustomerEmail']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='CustomerPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit'][1]")
	WebElement signinbutton;
	
	@FindBy(xpath="//a[@id='customer_logout_link']")
	WebElement LogoutButton;
	
	public WebElement Login_click()
	{
		return login;
	}
	
	public WebElement Email()
	{
		return emailid;
		
	}
	public WebElement Password()
	{
		return password;
		
	}
	
	public WebElement Sign_in()
	{
		return signinbutton;
		
	}
	public WebElement Logout_validate()
	{
		return LogoutButton;
		
	}
}
