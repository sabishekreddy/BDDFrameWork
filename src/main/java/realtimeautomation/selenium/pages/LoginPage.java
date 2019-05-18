package realtimeautomation.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import realtimeautomation.selenium.driverfactory.PageObjectBase;

public class LoginPage extends PageObjectBase {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username") 
	WebElement emailfield;
	
	@FindBy(id="kc-login") 
	WebElement loginbtn;
	
	@FindBy(xpath=".//*[contains(text(),'Email Address')]") 
	WebElement email_hedder;
	
	@FindBy(xpath=".//*[contains(text(),'Password:')]") 
	WebElement password_hedder;
	
	@FindBy(xpath = ".//*[contains(text(),'Invalid username or password.')]") 
	WebElement errormessage;
	
	public void enteremail(String email) throws InterruptedException{
		
		emailfield.sendKeys(email);
		Thread.sleep(5000);
	}
	
	public void loginbtn() throws InterruptedException{
		
		loginbtn.click();
		Thread.sleep(5000);
	}
	
	public String validateErrorMessage() throws InterruptedException{
		
	
		return errormessage.getText();
		
	}
	
	public String email_hedder(){
		
		return email_hedder.getText();
	}
	
	public String password_hedder(){
		
		return password_hedder.getText();
	}
	
}
