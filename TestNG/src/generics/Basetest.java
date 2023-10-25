package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pomclasses.ActitimeLoginPage;
import pomclasses.Actitime_home_Page;

public class Basetest
{
	public WebDriver driver;
	@BeforeClass
	public void setup() throws Throwable 
	{
	  driver = new ChromeDriver();
		driver.get("https:/demo.actitime.com");
		driver.manage().window().maximize();
		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginmethod();
	}
	
	@AfterClass
	public void tologout() throws Throwable
	{
		Thread.sleep(5000);
		Actitime_home_Page home = new Actitime_home_Page(driver);
		home.teardown();
	}
	
	@BeforeSuite
	public void suitelevel()
	{
		System.out.println("Execution Started in Suite level");
	}
	@AfterSuite
	public void suitelevel1()
	{
		System.out.println("Execution Ended in Suite level");
	}
	
	
	
	
	
	
	

}
