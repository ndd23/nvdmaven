package nivd;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test_screenshot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//capture full screenshot
		 String rm=RandomString.make(4);
		TakesScreenshot ts = (TakesScreenshot) driver;  //type casting
         File src =ts.getScreenshotAs(OutputType.FILE);
         File dstn = new File("C:\\Users\\Dell Insp. 15-3542\\eclipse-workspace\\nivd\\screenshot\\"+rm+".png");
		FileUtils.copyFile(src, dstn);
		//perticular webelement
                    WebElement logo=  driver.findElement(By.xpath("//img[@alt='Facebook']"));
                File src1 = logo.getScreenshotAs(OutputType.FILE);
                File dstn1 = new File("C:\\Users\\Dell Insp. 15-3542\\eclipse-workspace\\nivd\\screenshot\\"+rm+".png");
                FileUtils.copyFile(src1, dstn1);
}
}