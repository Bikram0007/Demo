package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scorlling_to_particular_Element {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		WebElement wikisource = driver.findElement(By.xpath("//span[.='Wikisource']/../../.."));
		int x = wikisource.getLocation().getX();
		int y = wikisource.getLocation().getY();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
	}

}
