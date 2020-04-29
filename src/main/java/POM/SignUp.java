package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projectResources.WebdriverInitialize;

public class SignUp extends WebdriverInitialize 
{
	
	@FindBy(xpath = "//span[@class='ico-user sprite-image']")
	public static WebElement userlogo_SIGNUP;
	
	
	@FindBy(xpath = "//a[@class='ico-register']")
	public
	WebElement register;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='ConfirmEmail']")
	WebElement confirmmail;
	
	@FindBy(xpath = "//input[@id='Username']")
	WebElement username;
	
	public void enterDetail_SIGNUP(String firstname, String lastname, String email, String confirmmail,String username)
	{
		this.firstname.click();
		this.firstname.sendKeys(firstname);
		
		this.lastname.click();
		this.lastname.sendKeys(lastname);
		
		this.email.click();
		this.email.sendKeys(email);
		
		this.confirmmail.click();
		this.confirmmail.sendKeys(confirmmail);
		
		this.username.click();
		this.username.sendKeys(username);
	}
	public SignUp(WebDriver driver) 
	{
		WebdriverInitialize.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
