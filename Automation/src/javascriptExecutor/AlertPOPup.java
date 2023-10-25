package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPOPup {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shadi.com");
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		}

}
