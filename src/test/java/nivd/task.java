package nivd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement txt_name=driver.findElement(By.name("firstName"));
		txt_name.sendKeys("ms");
		WebElement txt_name1=driver.findElement(By.name("lastName"));
		txt_name1.sendKeys("dhoni");
		WebElement txt_name2=driver.findElement(By.name("phone"));
		txt_name2.sendKeys("9988776655");
		WebElement txt_name3=driver.findElement(By.name("userName"));
		txt_name3.sendKeys("msd@gmail.com");
		WebElement txt_name4=driver.findElement(By.name("address1"));
		txt_name4.sendKeys("shivaji nagar");
		WebElement txt_name5=driver.findElement(By.name("city"));
		txt_name5.sendKeys("punne");
		WebElement txt_name6=driver.findElement(By.name("state"));
		txt_name6.sendKeys("maharashtra");
		WebElement p_code=driver.findElement(By.name("postalCode"));
		 p_code.sendKeys("54321");
		 WebElement u_name=driver.findElement(By.name("email"));
		 u_name.sendKeys("msd@gmail.com");
		 WebElement p_word=driver.findElement(By.name("password"));
		 p_word.sendKeys("msd@123");
		 WebElement c_word=driver.findElement(By.name("confirmPassword"));
		 c_word.sendKeys("msd@123");
		 WebElement btn_submit = driver.findElement(By.name("submit"));
	   	   btn_submit.click();
		 
	}
		 
		
	}


