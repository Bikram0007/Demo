package fatchingData;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HashMap1111
{
	public WebDriver driver;
	@BeforeClass
	public void setup() throws Throwable 
	{
	  driver = new ChromeDriver();
		driver.get("https:/demo.actitime.com");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tologout() throws Throwable
	{
		Thread.sleep(5000);
		driver.quit();
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
	public static HashMap<String, String>getcradencialmap()
	{
		HashMap<String, String>hash= new HashMap<String, String>();
		hash.put("admin", "admin:manager");
		hash.put("seller", "Debasish:Debasish@123");
		hash.put("dustributor", "Rajesh:Rajesh@123");
		hash.put("delivery", "Sunil:Sunil@123");
		hash.put("user", "Sameer:Sameer@123");
		return hash;
		
	}
	@Test
	public void loginsetup()
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(getcradencialmap().get("admin").split(":")[0]);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(getcradencialmap().get("admin").split(":")[1]);
	}

}
