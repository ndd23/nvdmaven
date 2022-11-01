package nivd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
         ChromeDriver driver =new ChromeDriver();
         driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
         driver.manage().window().maximize();
        WebElement fname = driver.findElement(By.name("firstname"));
        fname.sendKeys("nivedita");
         WebElement lname = driver.findElement(By.name("lastname"));
         lname.sendKeys("deohate");
         WebElement radio_sex = driver.findElement(By.id("sex-1"));
         radio_sex.click();
         WebElement radio_exp = driver.findElement(By.id("exp-2"));
         radio_exp.click();
         WebElement txt_datepicker = driver.findElement(By.id("datepicker"));
        txt_datepicker.sendKeys("28-09-2022");
        WebElement radio1 = driver.findElement(By.id("profession-1"));
        radio1.click();
        WebElement radio2 = driver.findElement(By.id("tool-2"));
        radio2.click();
        
        WebElement txt = driver.findElement(By.id("continents"));
        txt.click();
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
	}
	}


