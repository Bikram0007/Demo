package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_home_Page 
{

	public WebDriver driver;
	//Deceleration
	@FindBy (xpath = "//a[.='Logout']")
	private WebElement logoutlink;

	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingbutton;


	@FindBy(xpath="//div[@id='container_users']")
	private WebElement userlink;

	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskbutton;
	//initilization
	public Actitime_home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void teardown() throws Throwable 
	{
		Thread.sleep(4000);
		logoutlink.click();
		driver.quit();
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
}