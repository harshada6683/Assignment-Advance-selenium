package Adv_selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Que_17 {
	@Test
	@Parameters({"username", "password"})
	public void function(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");			
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		driver.close();

	}
	
	
}
