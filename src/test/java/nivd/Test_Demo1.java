package nivd;
	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Demo1 {
	
	WebDriver driver;
	@BeforeMethod
	public void BM() {
		System.out.println("Browser Open");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=0)
	public void Testa() {
		
		// Browser Open 
		System.out.println("Test a");
	}
	
	@Test(priority=3,enabled=false)
	public void Testb() {
		System.out.println("Test b");
	}
	
	
	@Test(priority=-1,invocationCount=3)
	public void Testz() {
		System.out.println("Test z");
	}
	
	
	@Test(priority=2)
	public void Teste() {
		System.out.println("Test e");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("Browser Close");
		
		driver.close();
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	


