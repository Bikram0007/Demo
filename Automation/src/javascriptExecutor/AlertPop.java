package javascriptExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("prompt('Swaraj are you sure your Girlfriend name is Anamika!!!!')" );
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Yes");
		alert.accept();

	}

}
