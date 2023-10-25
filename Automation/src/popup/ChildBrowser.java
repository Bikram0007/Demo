package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowser {

	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		WebElement freshers = driver.findElement(By.xpath("//a[@title='Fresher']"));
		
		freshers.click();
		
		System.out.println(driver.getWindowHandle());
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		Thread.sleep(2000);
		ArrayList<String>al = new ArrayList<String>(windowHandles);
		System.out.println(al.size());
	
		for (int i=0; i<al.size();i++)
		{
			driver.switchTo().window(al.get(i));
			String actualtitle = driver.getTitle();
			System.out.println(actualtitle);
			if(actualtitle.contains("Fresher Jobs"))
			{
				driver.findElement(By.xpath("//div[@class='nI-gNb-sb__main']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[contains(@placeholder,'Enter keyword')]")).sendKeys("Selenium");
			}
		}
		
		
	}

}
