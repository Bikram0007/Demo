package functional;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test
{
	@Test
	public void login()
	{
		System.out.println("login is done");
	}

	@Test(dependsOnMethods = "login")
	public void createtypesofwork()
	{
		System.out.println("createtypesofwork is done");
	}
	@Test(dependsOnMethods = "createtypesofwork")
	public void deletetypesofwork()
	{
		
		System.out.println("deletetypesofwork is done");
		Assert.fail();
	}
	@Test(dependsOnMethods = "deletetypesofwork")
	public void logout()
	{
		System.out.println("logout is done");
	}
}
