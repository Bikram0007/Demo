package testCase;

import org.testng.annotations.Test;

import generics.Basetest;
import pomclasses.ActitimeSettingPage;
import pomclasses.ActitimeTypeOfWorkPage;
import pomclasses.Actitime_home_Page;

public class ActitimeDeleteTypeOfWork extends Basetest
{
	@Test(dependsOnMethods = "ActitimeCreateNewTypeOfWork")

	public void Actitimedeletetypeofwork() throws Exception
	{
		
		
		Actitime_home_Page homepageopen = new Actitime_home_Page(driver);
		homepageopen.settingmethod();
		
		ActitimeSettingPage settingpage = new ActitimeSettingPage(driver);
		settingpage.typesofwork();
		
		ActitimeTypeOfWorkPage typeofwork= new ActitimeTypeOfWorkPage(driver);
	    typeofwork.DeltethenameMethod();
	    typeofwork.alertmethod();
		
		
	}
}
