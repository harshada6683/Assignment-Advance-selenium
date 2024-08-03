package Adv_selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que_6
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		Thread.sleep(2000);
		for (int i = 1; i <=3; i++) 
		{
			driver.findElement(By.id("vfb-7-"+i)).click(); 
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.close();
		
	}
}
