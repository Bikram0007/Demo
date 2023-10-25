package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom_class.ActitimeLoginPage;

@Listeners(generics.Screenshot.class)
public class ActitimeLoginLogout extends BaseTest
{
	@Test
	public void Actitimeloginlogout() throws Exception
	{
		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginmethod();
		
		}

}
