package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumautosuggestion 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='pcTkSc']/../.."));
		System.out.println(suggestion.size());
		/*for(WebElement newsugg : suggestion)
		{
			System.out.println(newsugg.getText());
			if (newsugg.getText().equals("selenium webdriver"))
			{
				newsugg.click();
				break;
			}*/
			for(int i=0;i<suggestion.size();i++)
			{
				if (suggestion.get(i).getText().equals("selenium webdriver"))
				{
					suggestion.get(i).click();
					break;
				}
			}
		}
	}


