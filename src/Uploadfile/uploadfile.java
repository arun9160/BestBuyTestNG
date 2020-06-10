package Uploadfile;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class uploadfile {
	static WebDriver driver;
	String baseurl = "https://login.salesforce.com/";
	
	
	@Test
	public void gettext() {
		
		
		driver.get(baseurl);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("arun");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("arun");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		String ele = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		System.out.println(ele);
	}
	
@Ignore
	@Test

public void Pagetitle() {
		driver.get(baseurl);
		String my_title = driver.getTitle();
		String expected_title = "Google";
		Assert.assertEquals(my_title, expected_title);
		System.out.println("Test COmpleted");
		
		String title = driver.getTitle();
		
		if(title.equals("Google")) {
			
			System.out.println("WE are in google home page");
		}else {
			
			System.out.println("The page title is incorrect");
		}
		
	
}
@Ignore  
@Test
  
  public void f() throws Exception{
	  
	  
	  	Thread.sleep(3000);
	  	WebElement addfile = driver.findElement(By.id("uploadfile_0"));
	  	addfile.sendKeys("C:\\Users\\91996\\Desktop\\64761\\Images.png"); 
	  
  }
  @BeforeClass
  public void beforeMethod() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91996\\eclipse-workspace\\BestBuyTestNG\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterClass
  public void teardown() {
	  
	  	driver.close();
	  
	  /*int status = result.getStatus();
	  
	  switch (status) {
	  
	  case ITestResult.SUCCESS:
		  break;
	  case ITestResult.FAILURE:
		  break;
	  default:
		  throw new RuntimeException("invalid status");*/
		  
		  	
	  }
  }


