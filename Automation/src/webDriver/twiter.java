package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twiter 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[.='Create account'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rony cute Mental");
		driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("8249312586");
	}
}
