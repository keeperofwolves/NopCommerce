package Tests;

import org.testng.annotations.Test;

import POM.SignIn;
import POM.SignUp;
import projectResources.WebdriverInitialize;

public class TestRunner extends WebdriverInitialize
{
	SignUp signup =new SignUp(getdriver());
	SignIn signin = new SignIn(getdriver());
	
	@Test(priority = 1)
	public void signUp_Website()
	{
		signup.mouseHover_SIGNUP();
		signup.clickOn_SIGNUP();
		signup.enterDetail_SIGNUP(firstname, lastname, email, confirmmail, username);
	}
	
	@Test(priority = 2)
	public void SignIn_Website()
	{
		signin.mouseHover_SIGNIN();
		signin.clickOn_SIGNIN();
		signin.enterDetail_SIGNIN(signin_username, signin_password);
	}
	
	@Test(priority = 3)
	public void closeBrowser() throws Exception
	{
		Thread.sleep(15000);
		getdriver().quit();
	}
}