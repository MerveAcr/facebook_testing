package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ultilites.Driver;

public class Facebook {
	public Facebook() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(css="a[rel='async']")
	public WebElement newAccountButton;
	
	@FindBy(css="div[class='mbs _52lq fsl fwb fcb']")
	public WebElement title;
	
	@FindBy(css="div[class='_52lr fsm fwn fcg']")
	public WebElement subtitle;
	
	@FindBy(css="input[name='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	public WebElement numberOrEmail;
	
	@FindBy(xpath="//input[@data-type='password']")
	public WebElement password;
	
	@FindBy(xpath="//div[@id='birthday_wrapper']//div[@class='mtm mbs _2_68']")
	public WebElement birthday;
	
	@FindBy(xpath="//div[@class='mtm mbs _2_68'][text()='Cinsiyet']")
	public WebElement gender;
	
	@FindBy(css="button[name='websubmit']")
	public WebElement signInButton;
	
	@FindBy(css="input[name='reg_email_confirmation__']")
	public WebElement reenterEmail;
	
	@FindBy(xpath="//div[@class='_5633 _5634 _53ij']")
	public WebElement firstNameError;
	
	@FindBy(css="div[data-testid=\"undefined\"]>div>div>div")
	public WebElement lastNameError;
	
	@FindBy(css="div[data-testid=\"undefined\"]>div>div>div")
	public WebElement numberOrEmailError ;
	
}
