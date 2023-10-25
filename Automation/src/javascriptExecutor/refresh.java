package javascriptExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class refresh {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='desktop-navLinks']"));
		
		for(WebElement newoptions:options)
		{
			System.out.println(newoptions.getText());
		}
		
		
		
	}

}
