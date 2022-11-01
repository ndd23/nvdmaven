package nivd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exeldatareader {

	public static void main(String[] args) throws Exception {
	 String file="C:\\Users\\Dell Insp. 15-3542\\eclipse-workspace\\nivd\\testdataexel\\dataex.xlsx";
       FileInputStream fis = new  FileInputStream(file);
        XSSFWorkbook wb = new  XSSFWorkbook( fis);
        String username= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
       System.out.println(username);
       String password= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
    		   System.out.println( password); 
    		   String password3= wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
    		   System.out.println( password3);
    		   double password1= wb.getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();
    		   System.out.println( password1); 
    		 
    		  String data1= String.valueOf(password1);
    		  System.out.println(data1);
    		  String data4=data1.replace(".0", "");
    		  System.out.println( data4);
//    		   
//    		 	WebDriverManager.chromedriver().setup();
//		         ChromeDriver driver = new ChromeDriver();
//		         driver.get("https://www.facebook.com/");                 
//		        driver.manage().window().maximize();	   
//    		   
//    		  WebElement textemail= driver.findElement(By.xpath("//input[@name='email']"));
//    		  textemail.sendKeys(username);
//    		   
//    		  WebElement textpass= driver.findElement(By.xpath("//input[@name='pass']"));
//    		  textpass.sendKeys(password);
//	}
}}