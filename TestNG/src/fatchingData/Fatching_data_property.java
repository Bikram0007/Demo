package fatchingData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fatching_data_property 
{
	public WebDriver driver;
	@Test
	public void propertyfile() throws IOException
	{
		FileInputStream fis =  new FileInputStream("./property/Datasheet.properties");
		Properties prt = new Properties();
		prt.load(fis);
		driver = new ChromeDriver();
		driver.get(prt.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prt.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(prt.getProperty("password"));
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}

}
