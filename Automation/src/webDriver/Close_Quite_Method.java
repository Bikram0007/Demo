package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quite_Method
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		String homepagetitle = driver.getTitle();
		System.out.println(homepagetitle);
		driver.findElement(By.linkText("Beauty")).click();
		Thread.sleep(4000);
		String beautytitle = driver.getTitle();
		System.out.println(beautytitle);
		if (beautytitle.equals(beautytitle))
		{
			System.out.println("Title is matching");
		}
		else 
		{
			System.out.println("Title is not matching");
		}
	}

}
