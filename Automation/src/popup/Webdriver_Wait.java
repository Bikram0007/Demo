package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver_Wait 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		//wait.until(ExpectedConditions.titleContains("Time-Track"));
		//wait.until(ExpectedConditions.urlContains("Swati"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Logout']")));
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
	}

}
