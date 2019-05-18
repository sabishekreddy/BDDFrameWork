package realtimeautomation.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import realtimeautomation.selenium.driverfactory.PageObjectBase;

public class LandingPage extends PageObjectBase{

	WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign in")
	WebElement signin;

	public LoginPage signIn() throws InterruptedException {

		signin.click();
		Thread.sleep(5000);

		return new LoginPage(driver);
	}
}
