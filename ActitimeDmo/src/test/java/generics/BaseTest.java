package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import pom_class.ActitimeHomePage;

public class BaseTest implements AutoConstant
{
	public static  WebDriver driver;

	@BeforeSuite
	public void executionStart()
	{
		System.out.println("execution started");
	}
   @Parameters("browser")
	@BeforeClass
	public void setup(String browser)
		{
	        if(browser.equalsIgnoreCase("chrome"))
	        {
	        	System.out.println("--------chrome launched--------");
	        }
			driver.manage().window().maximize();
			driver.get(url);
		}
		  @AfterClass 
		  public void teardown() throws InterruptedException 
		  {
		  
		  ActitimeHomePage homePage=new ActitimeHomePage(driver);
		  homePage.logoutMethod();
		  Thread.sleep(5000);
		  driver.quit(); 
		  }
		 
	@AfterSuite
	public void executionComplete() throws InterruptedException
	{
		System.out.println("execution ends......");
	}
}