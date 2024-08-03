package Adv_selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que_5 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://login.yahoo.com/account/create?");
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Janvi");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("patil");
		Thread.sleep(2000);
		driver.findElement(By.name("userId")).sendKeys("Janvi.1994");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Abhi@1204");
		Thread.sleep(2000);
		driver.findElement(By.name("mm")).sendKeys("April");
		Thread.sleep(2000);
		driver.findElement(By.name("dd")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.name("yyyy")).sendKeys("1994");
		Thread.sleep(2000);
		
		driver.findElement(By.name("signup")).click();
		Thread.sleep(2000);
		
		driver.close();
}
}