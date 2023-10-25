package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class ActitimeHomePage extends ExcelLibrary
{
	WebDriver driver;
	
	//intialization
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskbutton;
	
	
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings ']")
	private WebElement settingbutton;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement userlink;
	
	
	
	// declaration
	public ActitimeHomePage ( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//utilization
	

    public void logoutMethod() throws InterruptedException
    {
    	Thread.sleep(5000);
    	logoutLink.click();
    }
    public void settingmethod() throws InterruptedException 
    {
    	settingbutton.click();
    	Thread.sleep(4000);
    }
    public void tasksmethod()
    {
    	taskbutton.click();
    	
    }
    public void userlinkmethod()
    {
    	userlink.click();
    }
  }

