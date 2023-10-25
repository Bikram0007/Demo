package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.ActitimeSettingPage;
import pom_class.ActitimeTypeOfWorkPage;

public class ActitimeDeleteTypeOfWork 
{
	@Test 

	public void Actitimedeletetypeofwork() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:/demo.actitime.com");
		driver.manage().window().maximize();

		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginmethod();
		
		ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
		homepageopen.settingmethod();
		
		ActitimeSettingPage settingpage = new ActitimeSettingPage(driver);
		settingpage.typesofwork();
		
		ActitimeTypeOfWorkPage typeofwork= new ActitimeTypeOfWorkPage(driver);
	    typeofwork.DeltethenameMethod();
	    typeofwork.alertmethod();
	    
	    
	    homepageopen.logoutMethod();
	    driver.quit();
		
		
		
	}
}
