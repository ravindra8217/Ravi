package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Otherparameters {
	
	 @Test (priority=0)
	  public void mon() {
		  
		  System.out.println(" Today is monday");
		  
	  }
	
	 @Test (priority=1)
	  public void tue() {
		  
		  System.out.println(" Today is tuesday");
		  
	  }
	 @Test (priority=2, enabled=false)
	  public void wed() {
		  
		  System.out.println(" Today is wednesday");
		  
	  }
	 @Test (priority=3 , dependsOnMethods={"fri"}) 
	  public void thur() {
		  
		  System.out.println(" Today is thursday");
		  
	  }
	

	 @Test (priority=4)
	  public void fri() {
		  
		  System.out.println(" Today is friday");
		  
	  }
	


	

}
