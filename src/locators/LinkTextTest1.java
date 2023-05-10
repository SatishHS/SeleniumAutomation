package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextTest1 
{
		public static void main(String[] args) 
		{
			WebDriver driver= new ChromeDriver();
		
			driver.get("https://demoapp.skillrary.com/login.php?type=login");

			driver.findElement(By.linkText("Forgot your password?")).click();
			
		}

	}
