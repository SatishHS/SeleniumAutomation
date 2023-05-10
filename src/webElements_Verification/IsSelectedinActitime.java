package webElements_Verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedinActitime 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement checkbox = driver.findElement(By.name("remember"));
		if(checkbox.isSelected())
		{
		System.out.println("Passed: Check box is selected");
		
		}
		else
		{
		System.out.println("Failed: Check box is not selected");
		checkbox.click();
		}
	}

}
