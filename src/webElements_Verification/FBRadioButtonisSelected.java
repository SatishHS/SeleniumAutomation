package webElements_Verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBRadioButtonisSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement button = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		if(button.isSelected())
		{
			System.out.println("passed: Male radio button is enabled");
			button.click();
		}
		else
		{
			System.out.println("Failed: Male radio button is not enabled");
			button.click();
		}
		
		
	}

}
