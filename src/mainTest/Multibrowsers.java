package mainTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import testUtility.CrossBrowsing;

public class Multibrowsers extends CrossBrowsing{
  @Test
  public void openurl() {
	  
	  driver.get("https://www.godaddy.com/");
	//*[@id="id-d9a9df7b-9a4f-4f64-97a9-1589478aa724"]/div[1]/img
	  
  }
  @AfterClass
  public void teardown() {
	  
	  driver.quit();
  }
}
