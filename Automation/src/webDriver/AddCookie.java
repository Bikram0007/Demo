package webDriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookie {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		Set<Cookie> oldCookies =driver.manage().getCookies();
		System.out.println(oldCookies.size());  //4
		for(Cookie cookie : oldCookies)
		{
			System.out.println("cookie name is :" +cookie.getName());
			System.out.println("cookie value is :" +cookie.getValue());
			System.out.println("---------------------------------------");
		}
		
		driver.manage().deleteCookieNamed("OGPC");
		Cookie newcookie = new Cookie("SRK", "SRK12345");

		driver.manage().addCookie(newcookie);

		Set<Cookie> newCookies =driver.manage().getCookies();
		System.out.println(newCookies.size());  //4
		for(Cookie cookie : newCookies)
		{
			System.out.println("cookie name is :" +cookie.getName());
			System.out.println("cookie name is :" +cookie.getValue());
			System.out.println("---------------------------------------");
		}
		driver.manage().deleteAllCookies();
		Set<Cookie> deleteCookies =driver.manage().getCookies();
		System.out.println(deleteCookies.size());  //0
			}
}


