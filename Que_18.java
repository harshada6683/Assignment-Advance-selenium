package Adv_selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Que_18 
{
	@DataProvider(name="Mayuri")
	public Object[][] input()
	{
		return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","problem_user"}};
		
	}
	@Test@DataProvider(name="Mayuri")
	public void function(String username, String password) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");			
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		
	}
}



