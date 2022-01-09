package step_definations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Facebook;
import ultilites.Config;
import ultilites.Driver;

public class FacebookDefs {
	Facebook home= new Facebook();
	
	@Given("^user on signin page$")
	public void user_on_signin_page() throws Throwable {
		Driver.getDriver().get(Config.getProperty("url"));
		Thread.sleep(3000);
	}

	@When("^user click create new account button$")
	public void user_click_create_new_account_button() throws Throwable {
		String signIn= home.newAccountButton.getText();
		Assert.assertEquals(signIn, "Yeni Hesap Oluþtur");
	    home.newAccountButton.click();
	    Thread.sleep(3000);
	}

	@Then("^user able to see sign up title$")
	public void user_able_to_see_sign_up_title() throws Throwable {
		String title = home.title.getText();
		Assert.assertEquals(title, "Kaydol");
		Thread.sleep(3000);
	}

	@Then("^user able to see sign up subtitle$")
	public void user_able_to_see_sign_up_subtitle() throws Throwable {
		String subTitle=home.subtitle.getText();
		Assert.assertEquals(subTitle, "Hýzlý ve kolaydýr.");
		Thread.sleep(3000);	
	}

	@Then("^user able to see firstname label$")
	public void user_able_to_see_firstname_label() throws Throwable {
		String firstNameLabel = home.firstName.getAttribute("aria-label");
		  Assert.assertEquals(firstNameLabel, "Adýn");
		  Thread.sleep(3000);
	}

	@Then("^user able to see lastname label$")
	public void user_able_to_see_lastname_label() throws Throwable {
		String lastNameLabel =home.lastName.getAttribute("aria-label");
		Assert.assertEquals(lastNameLabel, "Soyadýn");
		Thread.sleep(3000);
	}

	@Then("^user able to see mobile number or email label$")
	public void user_able_to_see_mobile_number_or_email_label() throws Throwable {
		String numberOrEmail = home.numberOrEmail.getAttribute("aria-label");
		Assert.assertEquals(numberOrEmail, "Cep telefonu numarasý veya e-posta");
		Thread.sleep(3000);
	}

	@Then("^user able to see new password label$")
	public void user_able_to_see_new_password_label() throws Throwable {
		 String password= home.password.getAttribute("aria-label");
		 Assert.assertEquals(password, "Yeni þifre");
		 Thread.sleep(3000);
	}

	@Then("^user able to see birthday header$")
	public void user_able_to_see_birthday_header() throws Throwable {
		String birthDay= home.birthday.getText();
		Assert.assertEquals(birthDay, "Doðum Tarihi");
		Thread.sleep(3000);
	}

	@Then("^user able to see gender header$")
	public void user_able_to_see_gender_header() throws Throwable {
		String gender =home.gender.getText();
		Assert.assertEquals(gender, "Cinsiyet"); 
		Thread.sleep(3000);
	}

	@Then("^user able to see sign up button text$")
	public void user_able_to_see_sign_up_button_text() throws Throwable {
		String signInButtton=home.signInButton.getText();
		Assert.assertEquals(signInButtton, "Kaydol");
	}
}
