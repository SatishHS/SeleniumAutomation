package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook 
{
//	declaration
	@FindBy(name="email")
	private WebElement usernametb;
	
	@FindBy(name="pass")
	private WebElement passwordtb;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbtn;

//	initialization
	public Facebook(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
//	utilization
	public void username(String name)
	{
		usernametb.sendKeys(name);
	}
	public void password(String pwd)
	{
		passwordtb.sendKeys(pwd);
	}
	public void login()
	{
		loginbtn.click();
	}


}
