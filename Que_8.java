package Adv_selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Que_8
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.name("country"));
		
		Select s1=new Select(e1);
		
		s1.selectByIndex(1);
		Thread.sleep(1000);
		s1.selectByValue("INDIA");
		Thread.sleep(2000);
		s1.selectByVisibleText("GERMANY");
		Thread.sleep(1000);
		
		driver.close();
	}
}
