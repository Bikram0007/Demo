package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckboc 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Bikram%20Keshari%20Sahoo/Desktop/Practice/Automation/Htmlpages/Handeling_multiple_webelement.html");
		List<WebElement> suggestion = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(suggestion.size());
		for(WebElement newsugg: suggestion)
		{
			Thread.sleep(2000);
			newsugg.click();
		}
		for(int i=0 ; i<suggestion.size();i+=2)
		{
			Thread.sleep(2000);
			suggestion.get(i).click();
		}
		for(int i=suggestion.size()-1;i>0;i-=2)
		{
			Thread.sleep(2000);
			suggestion.get(i).click();
		}
		
	}

}
