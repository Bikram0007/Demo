package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom_class.ActitimeCreateNewLeaveType;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLeaveTypePage;
import pom_class.ActitimeLoginPage;
import pom_class.ActitimeSettingPage;

public class ActitimeLeaveTypeAndLogout extends BaseTest
{

	@Test
	public void leaveapplay() throws Throwable
	{
		
			
	
			ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
			loginpage.loginmethod();
			
			ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
			homepageopen.settingmethod();
			
			ActitimeSettingPage settingpage = new ActitimeSettingPage(driver);
			settingpage.leavetype();
			
			ActitimeLeaveTypePage leavetype = new ActitimeLeaveTypePage(driver);
			leavetype.createleavetypeMethod();
			
			ActitimeCreateNewLeaveType newleavetype = new ActitimeCreateNewLeaveType(driver);
			newleavetype.createnewleavetypeMethod();
			newleavetype.secondcreateleavemethod();
			newleavetype.deletetypeleavemethod();
			
			
	}
}
	
