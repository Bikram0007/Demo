package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generics.Basetest;
import pomclasses.ActitimeSettingPage;
import pomclasses.ActitimeTypeOfWorkPage;
import pomclasses.Actitime_home_Page;
import pomclasses.CreateNewTypeOfWorkPage;

public class ActitimeCreateNewTypeOfWork extends Basetest
{
	@Test 
	
	public void Actitimecreatenewtypeofwork() throws Exception
	{
		Actitime_home_Page homepageopen = new Actitime_home_Page(driver);
		homepageopen.settingmethod();
		
		ActitimeSettingPage settingpage = new ActitimeSettingPage(driver);
		settingpage.typesofwork();
		
		ActitimeTypeOfWorkPage typeofwork= new ActitimeTypeOfWorkPage(driver);
		typeofwork.createTypeOfWork();
		
		
		CreateNewTypeOfWorkPage nameentry = new CreateNewTypeOfWorkPage(driver);
		nameentry.nameMethod();
	    nameentry.createtypeofworkmethod();

	}
	
}