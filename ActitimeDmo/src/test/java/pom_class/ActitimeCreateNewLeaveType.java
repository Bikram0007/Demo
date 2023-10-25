package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class ActitimeCreateNewLeaveType extends ExcelLibrary
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
	private WebElement createnewleavetype;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement secondcreatenewleave;
	
	@FindBy (xpath = "//span[.='causal']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement deleteleavetype;
	
	public ActitimeCreateNewLeaveType  ( WebDriver driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createnewleavetypeMethod() throws Throwable
	{
		createnewleavetype.sendKeys("causal");
		
		
	}
	public void secondcreateleavemethod()
	{
		secondcreatenewleave.click();
	}
	public void deletetypeleavemethod() throws Throwable
	{
		Thread.sleep(5000);
		deleteleavetype.click();
		driver.switchTo().alert().accept();
	}
}
