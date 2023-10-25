package webDriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[.='Sign up']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("8249312586");
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Rony");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Rony123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rony Mental");
		
	}
}
