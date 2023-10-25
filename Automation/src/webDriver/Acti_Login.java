package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_Login
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		Thread.sleep(3000);
		List<WebElement> items = driver.findElements(By.xpath("//a[@class='item_link']/.."));
		Thread.sleep(2000);
		for(int i=0 ; i<items.size();i++)
		{
			String expeteditem = items.get(i).getText();
			if (expeteditem.equals("Types of Work"))
			{
				items.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("AnkitBiswal");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='AnkitBiswal']/../..//a[contains(.,'delete')]")).click();
	}

}
