package My_Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handling_Alerts {
	//declaring driver globally
		WebDriver driver ;
		
		@BeforeTest
		public void setup() {
			//creating an instance of chrome driver.
			driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
			driver.manage().window().maximize();
		}
		
		@Test
		public void tc1() throws InterruptedException {
			
				
						
		}
		
		@AfterTest
		public void teardwon() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.quit();
		}
}
