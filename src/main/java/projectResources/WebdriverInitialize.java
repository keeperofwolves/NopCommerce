package projectResources;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInitialize extends resource
{
	public static WebDriver driver = null;
	public WebdriverInitialize() 
	{
		if(driver == null)
		{
			System.setProperty(chrome, driverURL);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(999999999, TimeUnit.MILLISECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("**Chrome driver initiated**");
			driver.get(website);
		}
		else
		{
			System.out.println("**Chrome driver already instantiated**");
		}
	}
	public static WebDriver getdriver()
	{
		if (driver == null)
		{
			return driver;
		}
		else
		{
			return driver;
		}
	}
}
