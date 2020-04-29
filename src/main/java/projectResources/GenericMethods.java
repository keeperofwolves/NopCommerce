package projectResources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericMethods extends WebdriverInitialize 
{
	public WebElement element;
	public WebElement clickeElement;
	public WebElement moveCursor(WebElement element)
	{
		this.element = element;
		Actions actions = new Actions(getdriver());
		actions.moveToElement(element).build().perform();
		return element;
	}
	
	public WebElement clickOnElement(WebElement clickelement)
	{
		this.clickeElement = clickelement;
		this.clickeElement.click();
		return clickelement;
	}
	
	public GenericMethods(WebDriver driver) {}
}
