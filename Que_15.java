package Adv_selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Que_15 
{
	
		WebDriver driver=null; //declare webdriver global
	@BeforeTest
		public void before() 
		{
			System.setProperty("webdriver.gecko.driver","G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");			
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	}

	@AfterTest
	public void after() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.close();
	}
}


