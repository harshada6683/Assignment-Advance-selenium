package Adv_selenium_webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que_13 
{
		WebDriver driver=null;
@Before
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
@After
	public void after() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.close();
	}
}
