package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		String maintitle = driver.getTitle();
		System.out.println(maintitle);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Men")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
