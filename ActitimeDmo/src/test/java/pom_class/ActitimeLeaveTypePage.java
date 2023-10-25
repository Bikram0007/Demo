package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class ActitimeLeaveTypePage extends ExcelLibrary

{
	@FindBy(xpath="(//div[.='Create Leave Type'])[2]")
	private WebElement createleavetypebutton;
	
	public ActitimeLeaveTypePage ( WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createleavetypeMethod()
	{
		createleavetypebutton.click();
	}

	
	
}
