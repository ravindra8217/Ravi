package Testng;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class comparestrings {
	
	public static WebDriver driver;
	@Test
	public void compare()
	{
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expval="My Account";
		driver.get("http://www.store.demoqa.com");
		String ele= driver.findElement(By.xpath(".//a[@text()='My Account']")).getText();
		System.out.println(ele);
		System.out.println(expval);
		Assert.assertEquals(ele, expval);
		
		
		
			
		
	}

}
