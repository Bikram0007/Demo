package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		List<WebElement> Allmodules = driver.findElements(By.xpath("//a[@class='oxd-main-menu-item']"));
		System.out.println(Allmodules.size());
		for(WebElement module:Allmodules)
		{
			if (module.getText().equals("Admin"))
			{
				module.click();
				break;
			}
		}
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("(//div[.='Bug Striker'])[2]/../..//div[@class='oxd-checkbox-wrapper']"));
		checkbox.click();
		WebElement Deletebutton = driver.findElement(By.xpath("((//div[.='Bug Striker'])[2]/../..//button[@type='button'])[1]"));
		Deletebutton.click();
		//driver.switchTo().alert().accept();
	}

}
