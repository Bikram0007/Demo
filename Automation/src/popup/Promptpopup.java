package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptpopup 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("prompt('Swati Is a Mental Kalia')");
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Yes she is a mental");
		alert.dismiss();
	}

}
