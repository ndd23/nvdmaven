package nivd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
       WebDriver driver =new ChromeDriver();
       driver.get("http://demo.guru99.com/test/guru99home/");
       
	}

}
