package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

/* Hierarchy of TestNg
 * 
 * Suite -> Test -> class -> method -> Test
 */
public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println(" User logged and performed some operations");
	  
	  //Click on My account button;
	  //enter username;
	  //enter password;
	  //click submit
	  //verify login page
	  //click logout
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println(" Create firefox instance and launch the application");
	  //Firefox driver invoke;
	  //Launch the application;
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println(" close the driver");
	  //close the driver
	  // driver.quit();
	  
  }

}
