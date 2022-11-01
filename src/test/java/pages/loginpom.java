package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
         @FindBy( how=How.XPATH,using="//input[@name='email']")
         private WebElement email;
         @FindBy( how=How.XPATH,using="//input[@name='pass']")
         private WebElement password;
         @FindBy( how=How.XPATH,using=" //button[@name='login']")
         private WebElement login;
         // public getter
		public WebElement getEmail() {
			return email;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLogin() {
			return login;
		}
         
         
         
         
         
}
