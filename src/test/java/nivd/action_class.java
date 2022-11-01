package nivd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action_class {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().window().maximize();
		 
	//	WebElement link_selenium= driver.findElement(By.xpath("//a[text()='Selenium']"));
		
		Actions act = new Actions(driver);
		// mouse hover element + click 
	//	act.moveToElement(link_selenium).click().build().perform();
		
		//drag and drop  src,dstn
		WebElement  src =driver.findElement(By.xpath("//a([@class='button button-orange'])[5]"));
		WebElement dstn=driver.findElement(By.xpath("//li([@class='placeholder'])[1]"));
		//drag src elemen and drop dstn element 
		act.dragAndDrop(src, dstn).build().perform();
		
		
		
		
		
		
		
		
		

	}

}
