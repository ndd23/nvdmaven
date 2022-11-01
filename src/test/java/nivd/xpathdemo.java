package nivd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathdemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         
         //identify ..>xpath..absolute
          
 WebElement txt_email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
 txt_email.sendKeys("abc");
 //relative ..>xpath
 WebElement txt_pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
 txt_pass.sendKeys("123");
         WebElement btn_login= driver.findElement(By.xpath("//*[@id=\"u_0_5_a+\"]"));
         btn_login.click();
         
         
	}

}
