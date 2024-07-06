package My_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handling_iframes {
	       //declaring driver globally
			WebDriver driver ;
			
			@BeforeTest
			public void setup() {
				//creating an instance of chrome driver.
				driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.manage().window().maximize();
			}
			
			@Test
			public void tc1() throws InterruptedException {
				
				//JavascriptExecutor interface was initiated  for scrolling 
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
	          
				WebElement ifr = driver.findElement(By.id("courses-iframe"));
				
				js.executeScript("arguments[0].scrollIntoView(true)",ifr);
				
				//switched to frame using js
				driver.switchTo().frame(ifr);
				
				driver.findElement(By.xpath("(//a[@class=\"theme-btn\"])[1]")).click();	
				
				Thread.sleep(2000);
				driver.switchTo().defaultContent();					
							
			}
			
			@AfterTest(enabled = false)
			public void teardwon() throws InterruptedException
			{
				Thread.sleep(3000);
				driver.quit();
			}
	
}
