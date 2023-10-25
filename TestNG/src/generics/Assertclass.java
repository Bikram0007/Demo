package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Assertclass 
{



	@Test
	public void assrt() 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String expectedtitle= "google";
		String actualtitle = driver.getTitle();
		//SoftAssert assr= new SoftAssert();
		
	   Assert. assertEquals(actualtitle, expectedtitle);
		System.out.println("title is matching");
		//assr.assertAll();

	}
	@Test
	public void assrty()
	{
		System.out.println("asder");
	}
}
