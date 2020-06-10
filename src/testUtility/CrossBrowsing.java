package testUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class CrossBrowsing {
	
	public WebDriver driver;
  
	@Parameters("browser")
  @BeforeClass
  public void setup(String browser) throws Exception {
		//check if parameter passed in TestNg is 'Chrome'
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91996\\eclipse-workspace\\BestBuyTestNG\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\91996\\eclipse-workspace\\BestBuyTestNG\\Resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			
				}else {
					
					throw new Exception("Browser is not correct");
				}	
	  driver.manage().window().maximize();
	  
  }

}
