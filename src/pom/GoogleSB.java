package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSB 
{
//	declaration
	@FindBy(name="q")
	private WebElement searchtb;
	
//	initialization
	public GoogleSB(WebDriver driver) //constructor
	{
		PageFactory.initElements(driver, this);
	}
	
//	utilization
	public void search(String name)
	{
		searchtb.sendKeys(name);
	}
	

}
