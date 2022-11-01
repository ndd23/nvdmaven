package nivd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testkeyboard {

	public static void main(String[] args) {
		
		//Browser open
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver =new ChromeDriver();
				 driver.get("https://www.facebook.com/");
				 driver.manage().window().maximize();
				 
				 //Elemnent identify --email->bugspotter
				  WebElement email =driver.findElement(By.xpath("//input[@name='email']"));
				  email.sendKeys("bugsptter");
				  Actions act =new Actions (driver);
				  
				  //ctrl+a
				 act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				 //ctrl+c
				 act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
				 driver.findElement(By.xpath("//input[@name='pass']")).click();
				 //ctrl+v
				 act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

	
	
}
