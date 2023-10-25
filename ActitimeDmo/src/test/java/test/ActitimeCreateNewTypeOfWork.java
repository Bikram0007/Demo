package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.ActitimeSettingPage;
import pom_class.ActitimeTypeOfWorkPage;
import pom_class.CreateNewTypeOfWorkPage;

public class ActitimeCreateNewTypeOfWork extends BaseTest
{
	@Test

	public void Actitimecreatenewtypeofwork() throws Exception
	{
		
		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginmethod();
		
		ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
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