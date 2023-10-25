package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  ActitimeLoginPage
{
	public WebDriver driver;
	//Declration
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy (name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy (id="loginButton")
	private WebElement loginButton;

	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTimeIncLink;
	
	//intialization
	
	public ActitimeLoginPage ( WebDriver driver)
	
	{
		this.driver  = driver;
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void loginmethod() throws Exception
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		loginButton.click();
		Thread.sleep(4000);
	}
	
	public void ForgotPasswordMethod()
	
	{
		forgotyourpasswordLink.click();
		
	}
	public void actitimeincMethod()
	{
		actiTimeIncLink.click();
	}
	

 }

