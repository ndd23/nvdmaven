package nivd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class test_2 {

	public static void main(String[] args) throws InterruptedException {
		//browser open
		  	WebDriverManager.chromedriver().setup();
		         ChromeDriver driver = new ChromeDriver();
		         driver.get("https://www.facebook.com/");
		        driver.manage().window().maximize();
		        // need to identify webelement ..  locators .. name
		      WebElement txt_email = driver.findElement(By.name("email"));
		      txt_email.sendKeys("test@123");
		      
		   WebElement txt_password = driver.findElement(By.name("pass"));
		   txt_password .sendKeys("12345");
		   
		   WebElement btn_login = driver.findElement(By.name("login"));
	   	   btn_login.click();
                          //title
		           String title = driver.getTitle();
		           System.out.println(title);
		           
		           String url= driver.getCurrentUrl();
		           System.out.println(url);           
        
		  //      driver.navigate().to("https://mvnrepository.com/");
        
		  //      Thread.sleep(4000);
		  //     driver.navigate().back(); 
        
		        //    Thread.sleep(2000);
		        //   driver.navigate().forward();
        
		        //   Thread.sleep(2000);
		        //   driver.navigate().refresh();
     //   driver.close();
        
                         
        
        
        
        
	}

}
