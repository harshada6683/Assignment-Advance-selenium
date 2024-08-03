package Adv_selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que_2 
{
	public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Forgotten password?")).click();
	Thread.sleep(2000);

	driver.findElement(By.partialLinkText("Messenger")).click();// if there are so many links at that time this locator can be used
	Thread.sleep(2000);
	driver.close();
}
}
