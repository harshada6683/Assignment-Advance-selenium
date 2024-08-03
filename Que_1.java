package Adv_selenium_webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Que_1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		driver.get("http://thedemosite.co.uk/");
		driver.get("http://newtours.demoaut.com/");
		driver.get("http://the-internet.herokuapp.com/");
		driver.get("https://www.techbeamers.com/");
		driver.get("https://automationexercise.com/");
		driver.get("https://magento.softwaretestingboard.com/");
		driver.get("https://demoqa.com/");
		driver.get("https://bstack.net/hosting/");
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		driver.close();
}
}
