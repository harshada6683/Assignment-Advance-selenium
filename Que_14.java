package Adv_selenium_webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que_14 
{
		WebDriver driver=null;
@Before
	public void before() 
	{
		System.setProperty("webdriver.gecko.driver","G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");			
		driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-gb&ifkv=ASKXGp3vT8zIUiOAwU6gvMG-gePcAyGpPaPmPH5_hrprb5VZ1qvPCulzgcaEZxFdM_Dk6mUUfmyCFw&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1292210657%3A1701189884494264&theme=glif");
	}
@Test
	public void login() throws InterruptedException 
	{
		driver.findElement(By.id("identifierId")).sendKeys("mayuri@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Next")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("Passwd")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Next")).click();
		Thread.sleep(5000);
	}
@After
	public void after() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.close();
	}
}
