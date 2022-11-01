package nivd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollexample {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      
      // scroll by pixel
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,300)","");
      Thread.sleep(3000);
      js.executeScript("window.scrollBy(0,-300)","");
      
      //to know the pixel ...documnt.body.scrollheight hit enter
      // scroll  by element
//      Thread.sleep(3000);
//        WebElement  link_eng = driver.findElement(By.xpath("//li[text()='English (UK)']"));
//      js.executeScript("arguments[0].scrollIntoView()",link_eng);
//      
      //@ eamil id    ..without send keys impqstn 
             WebElement  id= driver.findElement(By.xpath("//input[@name='email']"));
             js.executeScript("arguments[0].value= 'selenium'", id);
      
	}

}
