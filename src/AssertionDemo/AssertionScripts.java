package AssertionDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {
	
	@Test
	public void test1()
	{
		System.setProperty("chromedriver", "C:\\Users\\rvanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("OPPO");
		driver.findElement(By.xpath("//*[@id='nav-orders']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("Ravindra");
		
		
		//Assert.assertEquals(12, 13);
	}

}
