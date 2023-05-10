package webElements_Verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchboxisDisplayed 
{
	public static void main(String[]args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
	if(searchtb.isDisplayed())
	{
	System.out.println("Passed: Search text box is displayed");
	searchtb.sendKeys("one plus nord");
	}
	else
	{
	System.out.println("Failed: Search text box is not displayed");
	}
	}

}
