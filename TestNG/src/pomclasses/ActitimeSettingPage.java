package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeSettingPage 

	{
	//declaration
		@FindBy(xpath="//div[.='Turn Features On / Off']")
		private WebElement turnfeaturelink;
		

		@FindBy(xpath="(//div[@class='item_title'])[3]")
		private WebElement generalsettinglink;
		

		@FindBy(xpath="//a[.='Workflow Settings']")
		private WebElement workflowsettinglink;
		

		@FindBy(xpath="//a[.='Types of Work']")
		private WebElement typesofworklink;
		

		@FindBy(xpath="//a[.='Leave Types']")
		private WebElement leavetypelink;
		
		@FindBy(xpath="//a[.='Notifications']")
		private WebElement notificationlink;

		@FindBy(xpath="//a[.='Logo Settings']")
		private WebElement logosettinglink;
		
		
		@FindBy(xpath="//div[.='Licenses']")
		private WebElement licenselink;
		
	
		//intialization
		public ActitimeSettingPage ( WebDriver driver)
		
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//utilization
		public void turnfeature()
		{
			turnfeaturelink.click();	
		}
		public void workflowsetting()
		{
			workflowsettinglink.click();
		}
		public void typesofwork()
		{
			typesofworklink.click();
		}
		public void leavetype()
		{
			leavetypelink.click();
		}
		public void notifications()
		{
			notificationlink.click();
		}
		public void logosetting()
		{
			logosettinglink.click();
		}
		public void license()
		{
			licenselink.click();
		}
		
		
		
	}


