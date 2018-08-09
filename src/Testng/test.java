package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	
	public static WebDriver driver;
	
	@Test
	public void toolsqa()
	{
		System.setProperty("chromedriver", "C:\\bin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		WebElement ele= driver.findElement(By.xpath(".//*[@id='account']/a"));
		Assert.assertTrue(ele.isDisplayed());
		System.out.println("Test Passed");
		
		
		
	}

}
