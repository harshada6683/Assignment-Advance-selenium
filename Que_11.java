package Adv_selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que_11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "G:\\Tops Techonology\\selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		//to get the no of col
		List<WebElement> tc=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("no of coloumn is : "+tc.size());
		Thread.sleep(2000);
		
		//to get col value
		List<WebElement> trElements= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("no of row is : "+trElements.size());
		
		for (int i=1; i<=trElements.size();i++)
		{
			for (int j = 1; j <=tc.size(); j++) {
				String tc_value=driver.findElement(By
						.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("     |   "+tc_value);
				Thread.sleep(2000);
			}
		}
				
	}
}
