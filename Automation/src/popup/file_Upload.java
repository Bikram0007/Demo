package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_Upload {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//V3
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//v4
		
		driver.findElement(By.xpath("//a[.='Register']")).click();
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
       StringSelection file = new StringSelection("C:\\Users\\Bikram Keshari Sahoo\\Desktop\\CV.docx");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
       Robot r = new Robot();
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_V);
       r.keyRelease(KeyEvent.VK_CONTROL);
       r.keyRelease(KeyEvent.VK_V);
       r.keyPress(KeyEvent.VK_TAB);
       r.keyPress(KeyEvent.VK_TAB);
       r.keyRelease(KeyEvent.VK_TAB);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
       
	}

}
