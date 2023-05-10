package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextonFacebook {

	public static void main(String[] args) 
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.partialLinkText("password?")).click();
			driver.findElement(By.id("identify_email")).sendKeys("9632279969");
			driver.findElement(By.name("did_submit")).click();
		}

	}