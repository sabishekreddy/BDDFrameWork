package realtimeautomation.selenium.driverfactory;

import org.openqa.selenium.chrome.ChromeDriver;

import realtimeautomation.selenium.pages.LandingPage;

public class DriverFactory  extends PageObjectBase{

	public DriverFactory(){
		
		super();
	}

	public LandingPage openUrl() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(AppUrl);
		Thread.sleep(5000);

		return new LandingPage(driver);

	}
}
