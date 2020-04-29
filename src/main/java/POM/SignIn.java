package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectResources.WebdriverInitialize;

public class SignIn extends WebdriverInitialize
{
	@FindBy(xpath = "//span[@class='ico-user sprite-image']")
	public static WebElement userlogo_SIGNIN;
	
	
	@FindBy(xpath = "//a[@class='ico-login']")
	public
	WebElement login;
	
	@FindBy(xpath = "//input[@id='Username']")
	WebElement username_SIGNIN;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password_SIGNIN;
	
	public void enterDetail_SIGNIN(String username_SIGNIN, String password_SIGNIN)
	{
		this.username_SIGNIN.click();
		this.username_SIGNIN.sendKeys(username_SIGNIN);
		this.password_SIGNIN.click();
		this.password_SIGNIN.sendKeys(password_SIGNIN);
	}
	
	public SignIn(WebDriver driver) 
	{
		WebdriverInitialize.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
