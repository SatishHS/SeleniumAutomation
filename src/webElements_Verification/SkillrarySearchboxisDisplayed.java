package webElements_Verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillrarySearchboxisDisplayed 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchtb = driver.findElement(By.xpath("//input[@type='search']"));
		if(searchtb.isDisplayed())
		{
		System.out.println("Passed: Search text box is displayed");
		}
		else
		{
		System.out.println("Failed: Search text box is not displayed");
		}
		Thread.sleep(5000);
		driver.close();

	}


}
