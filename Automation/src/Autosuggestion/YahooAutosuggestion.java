package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAutosuggestion 
{
	public static void main(String[] args) throws Throwable
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/?guccounter=1");
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("selenium");
		Thread.sleep(4000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//b[.='selenium']/../.."));
		System.out.println(suggestion.size());
		for(WebElement newsugg : suggestion)
		{
			String exprec = newsugg.getText();
			System.out.println(exprec);
			if (exprec.equalsIgnoreCase("selenium rich foods")) 
			{
				newsugg.click();
			}
			
		}
		
		
	}

}
