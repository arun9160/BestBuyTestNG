package mainTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//taggName[contains(@attribute,'Value')] -- xpath
		
		//tagname[Attribute* = 'valuee']
		// ex - //input[Attribute* = 'username']
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91996\\eclipse-workspace\\BestBuyTestNG\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.godaddy.com/");
		//driver.findElement(By.xpath("//input[contains(@class, 'searchInput')]")).sendKeys("hello");
		//driver.findElement(By.xpath("//input[contains(@placeholder, 'Find your perfect domain...')]")).sendKeys("hello");
		driver.findElement(By.cssSelector("//input[class*='searchInput']")).sendKeys("hello");
		
	}

}
