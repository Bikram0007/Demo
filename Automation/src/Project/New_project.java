package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_project 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.apploye.com"); 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bkesharisahoo@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bikram@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Let Me In']")).click();
	}

}
