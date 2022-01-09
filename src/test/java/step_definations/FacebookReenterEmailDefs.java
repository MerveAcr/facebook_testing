package step_definations;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Facebook;

public class FacebookReenterEmailDefs {
	Facebook page = new Facebook();
	
	@When("^user fill firstname field as a \"([^\"]*)\"$")
	public void user_fill_firstname_field_as_a(String name) throws Throwable {
		page.firstName.sendKeys(name);
		Thread.sleep(3000);
	}

	@When("^user fill lastname field as a \"([^\"]*)\"$")
	public void user_fill_lastname_field_as_a(String lastName) throws Throwable {
		page.lastName.sendKeys(lastName);
		Thread.sleep(3000);
	}

	@When("^user fill email field as \"([^\"]*)\"$")
	public void user_fill_email_field_as(String numberOrEmail) throws Throwable {
		page.numberOrEmail.sendKeys(numberOrEmail);
		Thread.sleep(3000);
	}

	@Then("^useer able to see reenter email label$")
	public void useer_able_to_see_reenter_email_label() throws Throwable {
		Assert.assertTrue(page.reenterEmail.isDisplayed());
	}


}
