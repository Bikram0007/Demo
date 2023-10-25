package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingOperation 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i= 0;i<=10;i++)
		{
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,200)");
		}
		for(int i= 0;i<=10;i++)
		{
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-200)");
		}
		
	}

}
