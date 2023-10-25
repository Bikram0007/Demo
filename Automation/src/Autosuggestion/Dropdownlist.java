package Autosuggestion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdownlist {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Bikram%20Keshari%20Sahoo/Desktop/Practice/Automation/Htmlpages/Dropdownlist.html");
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='students']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		List<String> optionTexts = new ArrayList<>();
		for (WebElement option : options)
		{
			optionTexts.add(option.getText());
		}
		System.out.println("String options of DDL is :" +optionTexts);
		
		Collections.sort(optionTexts);
		for (String optionText : optionTexts)
		{
			dropdown.selectByVisibleText(optionText);
		}
		System.out.println("Items in Assending order :" +optionTexts);
		Collections.reverse(optionTexts);
		for (String optionText : optionTexts) 
		{
			dropdown.selectByVisibleText(optionText);
		}
		System.out.println("Items in Decending order :" +optionTexts);

	}

}


