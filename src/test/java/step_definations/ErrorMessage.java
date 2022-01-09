package step_definations;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Facebook;

public class ErrorMessage {
	Facebook page = new Facebook(); 

	@When("^user click firstname box$")
	public void user_click_firstname_box() throws Throwable {
		page.firstName.click(); 
	}

	@When("^user click lastname box$")
	public void user_clisck_lastname_box() throws Throwable {
	    page.lastName.click();
	    Thread.sleep(3000);
	}

	@Then("^user able to see firstname error message$")
	public void user_able_to_see_firstname_error_message() throws Throwable {
	  String errorMessage=page.firstNameError.getText();
	  Assert.assertEquals(errorMessage, "Adýn nedir?");
	}

	@When("^user click number or email box$")
	public void user_click_number_or_email_box() throws Throwable {
	    page.numberOrEmail.click();
	    Thread.sleep(4000);
	}

	@Then("^user able to see lastname error mesage$")
	public void user_able_to_see_lastname_error_mesage() throws Throwable {
	    String errorMessage=page.lastNameError.getText();
	    Assert.assertEquals(errorMessage, "Adýn nedir?");
	}

	@When("^user click password box$")
	public void user_click_password_box() throws Throwable {
	   page.password.click();
	   Thread.sleep(5000);
	}

	@Then("^user able to see number or email error message$")
	public void user_able_to_see_number_or_email_error_message() throws Throwable {
	    String errorMessage= page.numberOrEmailError.getText();
	    Assert.assertEquals(errorMessage,"Giriþ yaparken ve þifreni yenilemen gerekirse bunu kullanacaksýn.");
	    Thread.sleep(3000);
	}
	

}
