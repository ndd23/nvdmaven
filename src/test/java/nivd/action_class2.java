package nivd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action_class2 {

	public static void main(String[] args) {
		
		//https://demo.guru99.com/test/simple_context_menu.html

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		// right click --> 
		
		Actions act=new Actions(driver);
		
		WebElement rightclickele=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement quit=driver.findElement(By.xpath("//span[text()='Quit']"));
		act.contextClick(rightclickele).click(quit).build().perform();
		
		
		// double click
		
		WebElement btndoublrclickele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(btndoublrclickele).build().perform();
		
		
	}



	}


