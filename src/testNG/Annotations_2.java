package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_2 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test 
	public void forgotPassword()
	{
		
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.name("forgetPasswordEmailOrUsername")).sendKeys("satish");
		driver.findElement(By.xpath("//div[text()='Request Login Info']")).click();
		String title = driver.getTitle();
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}


}
