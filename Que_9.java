package Adv_selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Que_9
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/");
	Thread.sleep(2000);
	
	WebElement home=driver.findElement(By.linkText("Home"));
	WebElement flights=driver.findElement(By.linkText("Flights"));
	WebElement hotels=driver.findElement(By.linkText("Hotels"));

	
	Actions actions=new Actions(driver);
	
	Action a1=actions.moveToElement(home).build();
	a1.perform();
	Thread.sleep(3000);
	
	Action a2=actions.moveToElement(flights).build();
	a2.perform();
	Thread.sleep(2000);
	
	Action a3=actions.moveToElement(home).build();
	a3.perform();
	Thread.sleep(2000);
	
	driver.close();
	
	
}
}
