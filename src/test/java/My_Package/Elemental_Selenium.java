package My_Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Elemental_Selenium {
	
         	//declaring driver globally
			WebDriver driver ;
			
			@BeforeTest
			public void setup() {
				//creating an instance of chrome driver.
				driver = new ChromeDriver();
				driver.get("https://elementalselenium.com/");
				driver.manage().window().maximize();
			}
			
			@Test
			public void tc1() throws InterruptedException {
	          
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				driver.findElement(By.id("alertBox")).click();
				Alert A = driver.switchTo().alert();
				A.accept();
				
				js.executeScript("window.scrollBy(0,100) ");
				js.executeScript("window.scrollBy(0,100) ");
						
				Thread.sleep(2000);
				driver.findElement(By.id("confirmBox")).click();
				Alert A1 = driver.switchTo().alert();
				A1.accept();
				Thread.sleep(2000);
				driver.findElement(By.id("promptBox")).click();
				Alert A2 = driver.switchTo().alert();
				A2.sendKeys("Hello All");
				A2.accept();
				Thread.sleep(2000);
					
							
			}
			
			@AfterTest
			public void teardwon() throws InterruptedException
			{
				Thread.sleep(3000);
				driver.quit();
			}

	
}
