package Adv_selenium_webdriver;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Que_12 {
@Test
	public void test1() 
	{
		int i=10, j=20;
		Assert.assertTrue(i<j);
		Assert.assertFalse(i>j);	
	}
@Test
	public void test2() 
	{
		String s1="tops";
		String s2=null;
		Assert.assertNull(s2);
		Assert.assertNotNull(s1);		
	}
@Test	
	public void test3() 
	{
		String str1="surat";
		String str2="surat";
		int i=12,j=12;
		Assert.assertSame(str1, str2);
		//Assert.assertNotSame(str1, str2);
		Assert.assertEquals(str1, str2);
		Assert.assertSame(i, j);
	}

@Ignore
@Test
	public void test4() 
	{
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4};
		
		Assert.assertArrayEquals(a,b);
	}
}
