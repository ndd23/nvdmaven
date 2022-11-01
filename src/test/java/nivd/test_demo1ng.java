package nivd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_demo1ng {
	WebDriver driver;
	@BeforeMethod
	public void BM() {
		System.out.println("browser Open");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();         // to make it accessible remow web
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1 ( ) {
		System.out.println("test1");
	}

	@Test
	public void test2( ) {
		System.out.println("test2");
	}
	
	
	@Test
	public void test3 ( ) {
		System.out.println("test3");
	}
     @AfterMethod
    public void AM() {
	System.out.println("browser close");
	driver.close();
}
	
}
