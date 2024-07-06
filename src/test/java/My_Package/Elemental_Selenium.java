package My_Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
	          driver.findElement(By.name("fields[email]")).sendKeys("Izuku777@gmail.com");
	          WebElement drp = driver.findElement(By.id("options"));
	          
	          Select s = new Select(drp);
	          s.selectByVisibleText("Python");
	          
	          driver.findElement(By.cssSelector("[value=\"Send me test automation Pro tips\"]")).click();
				
	          driver.navigate().back();
	          
	          driver.findElement(By.cssSelector("[value=\"Send me test automation Pro tips\"]")).click();
					
							
			}
			
			@AfterTest
			public void teardwon() throws InterruptedException
			{
				Thread.sleep(3000);
				driver.quit();
			}

	
}
