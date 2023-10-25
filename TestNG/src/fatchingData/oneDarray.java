package fatchingData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class oneDarray 
{
	public WebDriver driver;
	@DataProvider(name="logindata")
	public String[][] setupdata()
	{
		String[][] data= {{"sameer","Anamika"},{"Rajesh"},
				          {"Avinash","Sunny"},{"admin","admin123"}};
		return data;
	}
	
	@Test(dataProvider = "logindata")
	public void setup(String obj,String pass) throws IOException
	{
		FileInputStream fis =  new FileInputStream("./property/Datasheet.properties");
		Properties prt = new Properties();
		prt.load(fis);
		driver = new ChromeDriver();
		driver.get(prt.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(obj);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
	}


}
