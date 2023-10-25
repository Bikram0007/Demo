package webDriver;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Enum {
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("Qspiders");
		String usernamevalue = username.getAttribute("value");
		int length = usernamevalue.length();
		System.out.println(length);
		Thread.sleep(4000);
		username.clear();
		username.sendKeys("Jspiders");
		for (int i=0;i<=1;i++)
		{
			Thread.sleep(3000);
			username.sendKeys(Keys.LEFT);
		}
		username.sendKeys(Keys.DELETE);
		for (int i=0 ;i<=2;i++)
		{
			Thread.sleep(3000);
			username.sendKeys(Keys.LEFT);
		}
		username.sendKeys(Keys.DELETE);
		username.sendKeys(Keys.CONTROL,"a");
		username.sendKeys(Keys.CONTROL,"c");
		
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys(Keys.CONTROL,"v");
		String passwordvalue = password.getAttribute("value");
		
		if(usernamevalue.equals(passwordvalue)) 
		{
			System.out.println("is matching");
		}
		else 
		{
			System.out.println("is not matching");
		}
		
	}

}
