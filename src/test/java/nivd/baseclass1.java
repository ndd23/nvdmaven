package nivd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass1 {
	
	WebDriver driver;
	@Parameters ("BrowserName")
	@BeforeMethod
		public void BrowserOpen(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		}
	@AfterMethod
	 public void tearDown() {
		driver.close();
	 }
}
