package webDriver;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Allcookies {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Set<Cookie> cookies = driver.manage().getCookies();
		Thread.sleep(3000);
		System.out.println(cookies.size());
		ArrayList<Cookie> newcookies = new ArrayList<Cookie>(cookies);
		System.out.println(newcookies.size());
		
		
		  // normal For loop 
		for(int i=0;i<newcookies.size();i++) 
		{ 
			System.out.println(newcookies.get(i).getName());
			System.out.println(newcookies.get(i).getDomain());
			System.out.println(newcookies.get(i).getPath());
			System.out.println(newcookies.get(i).getExpiry());
		}
		System.out.println("----------------------------------------------------");
		
		//for each loop
		for(Cookie x : cookies)
		{
			System.out.println(x.getName());
			System.out.println(x.getDomain());
			System.out.println(x.getPath());
			System.out.println(x.getExpiry());
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");

	}

}
