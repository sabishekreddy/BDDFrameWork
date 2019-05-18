package realtimeautomation.selenium.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import realtimeautomation.selenium.driverfactory.CommonHelper;
import realtimeautomation.selenium.driverfactory.DriverFactory;
import realtimeautomation.selenium.pages.LandingPage;
import realtimeautomation.selenium.pages.LoginPage;
import realtimeautomation.selenium.utilities.BaseTest;

public class LoginStepDefinition extends CommonHelper{

	DriverFactory driverfactory;
	LandingPage ladingpage;
	LoginPage login;

	WebDriver driver;

	public LoginStepDefinition() {

		driverfactory = PageFactory.initElements(driver, DriverFactory.class);

	}
	
	@Before
	public void LoadTestData() throws Exception
	{
		BaseTest load = new BaseTest();
		load.setupSuite();
	}

	@After
	public void close(Scenario scenario) throws Exception{
		
		tearDown(scenario);
	}
	@Given("^Navigate to utest url$")
	public void navigate_to_utest_url() throws Throwable {

		ladingpage = driverfactory.openUrl();
	}

	@When("^Click on sign in link$")
	public void click_on_sign_in_link() throws Throwable {

		login = ladingpage.signIn();
	}

	@When("^Enter email \"([^\"]*)\"$")
	public void enter_email(String testcase) throws Throwable {

		String email = TestDataProperties.getProperty("Utest."+testcase+"."+ profile);
		login.enteremail(email);
		
	}

	@When("^Click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {

		login.loginbtn();
	}

	@Then("^validate the error message \"([^\"]*)\"$")
	public void validate_the_error_message(String testcase) throws Throwable {

		String expected = TestDataProperties.getProperty("Utest."+testcase+"."+ profile);
		Assert.assertEquals(expected, login.validateErrorMessage());
	}

}
