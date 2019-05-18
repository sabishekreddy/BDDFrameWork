package realtimeautomation.selenium.stepdefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import realtimeautomation.selenium.driverfactory.DriverFactory;
import realtimeautomation.selenium.pages.LandingPage;
import realtimeautomation.selenium.pages.LoginPage;

public class StepDefination {
/*
	DriverFactory driverfactory;
	LandingPage ladingpage;
	LoginPage login;

	WebDriver driver;

	public StepDefination() {

		driverfactory = PageFactory.initElements(driver, DriverFactory.class);

	}

	@Given("^Navigate to utest url$")
	public void navigate_to_utest_url() throws Throwable {

		ladingpage = driverfactory.openUrl();

	}

	@When("^Click on sign in link$")
	public void click_on_sign_in_link() throws Throwable {

		login = ladingpage.signIn();

	}

	@When("^Click on sign in button$")
	public void click_on_sign_in_button() throws Throwable {

		login.loginbtn();

	}

	@Then("^validate the error message \"([^\"]*)\"$")
	public void validate_the_error_message(String expected) throws Throwable {

		Assert.assertEquals(expected, login.validateErrorMessage());

	}

	@Given("^Enter email \"([^\"]*)\"$")
	public void enter_email(String email) throws Throwable {

		login.enteremail(email);

	}

	
	 * @Then("^validate the error message$") public void
	 * validate_the_error_message(DataTable table) throws Throwable {
	 * List<List<String>> list = table.asLists(String.class); for(int i=1;
	 * i<list.size(); i++) { Assert.assertEquals(list.get(i).get(0),
	 * login.email_hedder()); Assert.assertEquals(list.get(i).get(1),
	 * login.password_hedder()); Assert.assertEquals(list.get(i).get(2),
	 * login.validateErrorMessage()); }
	 * 
	 * }
	 

	@Then("^validate the error message$")
	public void validate_the_error_message(DataTable table) throws Throwable {

		List<Map<String, String>> list = table.asMaps(String.class, String.class);
		Assert.assertEquals(list.get(0).get("EMAIL_HEDDER"), login.email_hedder());
		Assert.assertEquals(list.get(0).get("PASSWORD_HEDDER"), login.password_hedder());
		Assert.assertEquals(list.get(0).get("ERROR_MSG"), login.validateErrorMessage());

	}*/

}
