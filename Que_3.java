package Adv_selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Que_3 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement e1=driver.findElement(By.id("fruits"));
		
		Select s1=new Select(e1);
		for (int i = 0; i < 3; i++)
			
		{
			s1.selectByIndex(i);
			Thread.sleep(1000);
		}
		driver.close();
	}
}
