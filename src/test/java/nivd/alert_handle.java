package nivd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_handle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 driver.manage().window().maximize();
		 
		WebElement text_element = driver.findElement(By.xpath("//input[@name='cusid']"));
		text_element .sendKeys("123456");
           WebElement btn_submit= driver.findElement(By.xpath("//input[@name='submit']"));
           btn_submit.click();
           // switch
          Alert  alt =driver.switchTo().alert();
          
          String text= alt.getText();
          System.out.println(text);
          
       //    click on cancel button
       //  alt.dismiss();
          
          // click on ok button
          alt.accept();
          
    //      Thread.sleep(4000);
        System.out.println( alt.getText());
        //click on ok button
        alt.accept();
        
          
          
          
          
	}

}
