package Tests;

import org.testng.annotations.Test;

import POM.SignIn;
import POM.SignUp;
import projectResources.GenericMethods;
import projectResources.WebdriverInitialize;

public class TestRunner extends WebdriverInitialize
{
	SignUp signup =new SignUp(getdriver());
	SignIn signin = new SignIn(getdriver());
	GenericMethods gm = new GenericMethods(getdriver());
	
	@Test(priority = 1)
	public void signUp_Website()
	{
		gm.moveCursor(SignUp.userlogo_SIGNUP);
		gm.clickOnElement(signup.register);
		signup.enterDetail_SIGNUP(firstname, lastname, email, confirmmail, username);
	}
	
	@Test(priority = 2)
	public void SignIn_Website()
	{
		gm.moveCursor(SignIn.userlogo_SIGNIN);
		gm.clickOnElement(signin.login);
		signin.enterDetail_SIGNIN(signin_username, signin_password);
	}
	
	@Test(priority = 3)
	public void closeBrowser() throws Exception
	{
		Thread.sleep(15000);
		getdriver().quit();
	}
}