package nivd;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childwindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentid =driver.getWindowHandle();
		System.out.println(parentid);
		// action
		 WebElement linkclick =driver.findElement(By.xpath("//a[text()='Click Here']"));
		 linkclick.click();
		
		Set<String> AllId=driver.getWindowHandles(); /// id..parent +child window
		System.out.println( AllId);
		
		List<String> ListId = new ArrayList(AllId);
		System.out.println(ListId.get(0));    //parentid
	System.out.println(ListId.get(1)); 
	
	///child window for multiple childwindow use for loop 
//		//for multiple child window
//		String childid =ListId.get(1);
//		for(int i=0;i<ListId.size();i++) {
//			String childAdd =ListId.get(i);
//			if(!childAdd.equals(parentid)){
//				driver.switchTo().window(childid);
//				driver.close()	;		}
//			}
//			
//			
//			
//		}

		 		
		String childid = (ListId.get(1));
		
		driver.switchTo().window(childid);  // we must have to switch to child window
		
		
		 WebElement emailId =driver.findElement(By.xpath("//input[@name='emailid']"));
		 emailId.sendKeys("niv123");
		 
	//	 driver.close();       /// cureent window
	//	 driver.quit();      //parent + child {all} window
	}

}
