package Adv_selenium_webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que_4 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		
		String main_w=driver.getWindowHandle(); // get current window address
		System.out.println("main window is :"+main_w);
		driver.findElement(By.partialLinkText("Clic")).click();
		Thread.sleep(2000);
		
		
		Set<String> set=driver.getWindowHandles(); // get all window address
		Iterator<String> i1=set.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
			String child_w =i1.next();
			
			if (!main_w.equals(child_w))
			{
				driver.switchTo().window(child_w);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("123");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();
			}
			
			driver.switchTo().window(main_w);
			System.out.println("now main is:"+main_w);
			Thread.sleep(2000);
			driver.close();
				
		}	
	}
}
