package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillrayDemo {


		public static void main(String[] args) 
		{
			WebDriver driver= new ChromeDriver();
		
			driver.get("https://demoapp.skillrary.com/login.php?type=login");
			driver.findElement(By.id("loginClick")).click();
			driver.findElement(By.id("email")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("admin");
			driver.findElement(By.id("last")).click();
			
		}

	}
