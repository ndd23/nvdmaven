package nivd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a1 {

	public static void main(String[] args) throws Exception {
		
           //chrome ..fb login   
             WebDriverManager.chromedriver().setup();
             ChromeDriver driver3 =new ChromeDriver ();
             driver3.get("https://www.facebook.com/");
	         driver3.manage().window().maximize();
	         Thread.sleep(3000); //3sec
		     driver3.close();
		
		
		
            // edge
            WebDriverManager.edgedriver().setup();
            EdgeDriver driver4=new EdgeDriver();
            driver4.get("https://www.facebook.com/");
            driver4.manage().window().maximize();
            Thread.sleep(3000);
            driver4.close();
	}

}
