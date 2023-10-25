package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entering_Value_to_textfield 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Bikram%20Keshari%20Sahoo/Desktop/Practice/Automation/Htmlpages/disableTextField.html");
		WebElement textfield = driver.findElement(By.xpath("//input[@type='text']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Qspiders'", textfield);
		
	}

}
