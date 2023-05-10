package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider 
{
	@DataProvider
	public Object getData()
	{
		Object[][] obj = new Object[3][3];
		obj[0][0] = "invalid username";
		obj[0][1] = "1234567";
		obj[0][2] = "manager";
		
		obj[1][0] = "valid data";
		obj[1][1] = "admin";
		obj[1][2] = "manager";
		
		obj[2][0] = "invalid password";
		obj[2][1] = "admin";
		obj[2][2] = "@manager123";
		return obj;
		
	}
	
	@Test (dataProvider = "getData")
	public void login(String Scenario, String username, String password) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		
		
		
		
	}
	
}
