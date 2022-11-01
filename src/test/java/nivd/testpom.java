package nivd;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpom;

public class testpom {
     @Test
     public void testlogin() {
    	 //browseropen
    		WebDriverManager.chromedriver().setup();
	         ChromeDriver driver = new ChromeDriver();
	         driver.get("https://www.facebook.com/login/");
	        driver.manage().window().maximize();
	        
	       //webelement ....> actions
	        loginpom login   =PageFactory.initElements(driver,loginpom.class );
	        login.getEmail().sendKeys("test");
	        login.getPassword().sendKeys("123");
	        login.getLogin().click();
     }
     
     
}
