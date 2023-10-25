package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLeaveTypePage 

{
	@FindBy(xpath="(//div[.='Create Leave Type'])[2]")
	private WebElement createleavetypebutton;
	
	@FindBy(xpath = "//span[.='causal']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement deleteleavetypebutton;
	
	public ActitimeLeaveTypePage ( WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createleavetypeMethod()
	{
		createleavetypebutton.click();
	}
	public void deleteleavetypeMethod() throws Throwable
	{
		Thread.sleep(4000);
		deleteleavetypebutton.click();
	}

	
	
}
