package Adv_selenium_webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que_10
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
						
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
				
		Alert alert1=driver.switchTo().alert();
		System.out.println("First alert message :" +alert1.getText());
		//alert1.accept();
		alert1.dismiss();
		
	//	Alert alert2=driver.switchTo().alert();
		//	System.out.println("second alert message :" +alert2.getText());
		//	alert2.accept();
	
			Thread.sleep(2000);
			driver.close();
		
	}
}
