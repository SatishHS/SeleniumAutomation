package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Data_Provider_Login_Scenarios 
{
	WebDriver driver;
	
	@DataProvider(name="credentials")
	public Object[][] getData()
	{
		return new Object[][]
		{
			{"both correct","admin","manager"},
			{"both wrong","admin123","manager123"},
			{"correct username","admin","manager123"},
			{"correct password","admin123","manager"}
		};
	}
		
		
		
		@Test(dataProvider = "credentials")
		public void verifyLogin(String scenario, String username, String password)
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
			if(scenario.equals("both correct"))
			{
				WebElement logout = driver.findElement(By.className("logout"));
				assertTrue(logout.isDisplayed(),"login unsucessful");
			}
			else if(scenario.equals("both wrong"))
			{
				String error = driver.findElement(By.xpath("//span[contains(text(),'Username or Password')]")).getText();
				assertEquals(error,"Username or Password is invalid. Please try again.");
			}
			else if(scenario.equals("correct username"))
			{
				String error = driver.findElement(By.xpath("//span[contains(text(),'Username or Password')]")).getText();
				assertEquals(error,"Username or Password is invalid. Please try again.");
			}
			else
			{
				String error = driver.findElement(By.xpath("//span[contains(text(),'Username or Password')]")).getText();
				assertEquals(error,"Username or Password is invalid. Please try again.");
			}
			
		}
		@AfterMethod
		public void closeApp()
		{
			
			driver.close();
		}
			

}
