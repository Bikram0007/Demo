package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseoperation 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);
		WebElement beauty = driver.findElement(By.xpath("//a[.='Men']"));
		Actions action = new Actions(driver);
		action.moveToElement(beauty).perform();
		
		  Thread.sleep(8000);
		  WebElement lipliner = driver.findElement(By.xpath("//a[.='Suits']")); 
		action.click(lipliner).perform();
		
	}

}
