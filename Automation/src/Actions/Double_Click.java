package Actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		Thread.sleep(3000);
		WebElement forgot = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Actions action = new Actions(driver);
		action.click(forgot).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
