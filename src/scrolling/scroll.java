package scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class scroll {
	@Test
	public void test1()
	{
		System.setProperty("chromedriver", "C:\\Users\\rvanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

}
}
