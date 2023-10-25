package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Popup {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/en-in/flights?");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[.='today'])[1]")).click();
		WebElement monthyear = driver.findElement(By.xpath("(//p[@class='flex w-full justify-center css-a0l5b2'])[1]"));
		String monthyearvalue= monthyear.getText();
		System.out.println("Month Year is :" + monthyearvalue);

		String month = monthyearvalue.split(" ")[0];
		System.out.println("month is :" + month);
		String year = monthyearvalue.split(" ")[1];
		System.out.println("year is :" + year);

		while(!( month.equals("December")&& year.equals("2024")))
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[.='keyboard_arrow_right'])[1]")).click();
			WebElement newmonthyear = driver.findElement(By.xpath("(//p[@class='flex w-full justify-center css-a0l5b2'])[1]"));
			String newmonthyearvalue= newmonthyear.getText();
			System.out.println("Month Year is :" + newmonthyearvalue);

			month = newmonthyearvalue.split(" ")[0];
			System.out.println("month is :" + month);
			year = newmonthyearvalue.split(" ")[1];
			System.out.println("year is :" + year);
		}
		driver.findElement(By.xpath("//p[.='December 2023']/..//div[.='25']")).click();
	}

}
