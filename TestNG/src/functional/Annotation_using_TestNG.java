package functional;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_using_TestNG 
{
	@Test
	public void c()
	{
		System.out.println("c");
	}
	@Test
	public void b()
	{
		System.out.println("b");
	}
	@Test
	public void a()
	{
		System.out.println("a");
	}
	@BeforeMethod
	public void Beforemethodlevel() 
	{
		System.out.println("Execution Started in Before Method Level");
	}
	@AfterMethod
	public void Aftermethodlevel() 
	{
		System.out.println("Execution Started in AfterMethod Level");
	}
	@BeforeClass
	public void BeforeClasslevel() 
	{
		System.out.println("Execution started in BeforeClasslevel");
	}
	@AfterClass
	public void AfterClasslevel() 
	{
		System.out.println("Execution started in AfterClasslevel");
	}
	
	@BeforeTest
	public void BeforeTestlevel() 
	{
		System.out.println("Execution started in BeforeTestlevel");
	}
	@AfterTest
	public void AfterTestlevel() 
	{
		System.out.println("Execution started in AfterTestlevel");
	}
	@BeforeSuite
	public void BeforeSuitelevel() 
	{
		System.out.println("Execution started in BeforeSuitelevel");
	}
	@AfterSuite
	public void AfterSuitelevel() 
	{
		System.out.println("Execution started in AfterSuitelevel");
	}
	
}
