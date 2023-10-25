package functional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clear 
{
	@Test
	public void startup() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Qspiders");
		String s = username.getAttribute("value");
		username.sendKeys(Keys.ARROW_UP);
		for (int i=0;i<s.length();i++)
		{
			Thread.sleep(2000);
			username.sendKeys(Keys.ARROW_RIGHT);
			if(s.charAt(i)=='e'||s.charAt(i)=='p')
			{
				Thread.sleep(3000);
				username.sendKeys(Keys.BACK_SPACE);
			}
		}
	}

}
