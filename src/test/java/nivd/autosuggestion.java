package nivd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestion {

	public static void main(String[] args) throws Exception {
		//Browser open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		 //identify .xpath by attribute
		WebElement txt_serarch = driver.findElement(By.xpath("//input[@name='q']"));
		txt_serarch.sendKeys("maven");
		Thread.sleep(4000);
		
		//autosuggestion ...>element..>identify
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b'][1]//li"));
		
		
		System.out.println(list.size());
		
		//autosuggestion option ..>click
		for(int i=0;i<list.size();i++) {
	   String text =list.get(i).getText();
		System.out.println(text);
		if(text.equals("maven dependency")) {
			list.get(i);
			break;
		}
	}
		

}
}