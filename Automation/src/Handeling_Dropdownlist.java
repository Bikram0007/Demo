import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handeling_Dropdownlist 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Bikram%20Keshari%20Sahoo/Desktop/Practice/Automation/Htmlpages/Dropdownlist.html");
		WebElement Drop = driver.findElement(By.xpath("//select[@name='students']"));
		Select sel = new Select(Drop);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("AS");
		Thread.sleep(2000);
		sel.selectByVisibleText("padma");
		//Thread.sleep(2000);
		//sel.deselectByVisibleText("padma");
		//Thread.sleep(2000);
		//sel.deselectAll();
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		for (WebElement all: allSelectedOptions)
		{
			System.out.println();
		}
		System.out.println(sel.isMultiple());
	}

}
