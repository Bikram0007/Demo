package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.AddNewTaskPage;
import pom_class.CreateNewCustomer;
import pom_class.DeleteSettingsPage;

public class ActitimeDeleteCustomer
{
	@Test
	public void Actitimeloginlogout() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:/demo.actitime.com");
		driver.manage().window().maximize();

		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginmethod();

		ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
		homepageopen.tasksmethod();

		AddNewTaskPage opentaskpage = new AddNewTaskPage(driver);
		opentaskpage.addnewtaskmethod();
		opentaskpage.createnewcustomerMethod();

		CreateNewCustomer addnewcustomer = new CreateNewCustomer(driver);
		addnewcustomer.customertextfieldMethod();
		addnewcustomer.customerdescriptiontextfieldMethod();
		addnewcustomer.createcustomerMethod();
		addnewcustomer.settingsMethod();

		DeleteSettingsPage deletename = new DeleteSettingsPage(driver);
		deletename.settingActionMethod();
		deletename.deleteMethod();
		deletename.deletepermanentelyMethod();
		
		homepageopen.logoutMethod();
		driver.close();


	}
}