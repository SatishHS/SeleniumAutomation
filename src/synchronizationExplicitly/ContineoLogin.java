package synchronizationExplicitly;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContineoLogin 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://sims.nie.ac.in/sims/");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement user = driver.findElement(By.name("username"));
		w.until(ExpectedConditions.visibilityOf(user)).sendKeys("satishhs@nie.ac.in");

		WebElement pwd = driver.findElement(By.name("passwd"));
		w.until(ExpectedConditions.visibilityOf(pwd)).sendKeys("H@s@s@21041990");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Login']"));
		w.until(ExpectedConditions.visibilityOf(button)).click();
		
		
		String Title = driver.getTitle();
		w.until(ExpectedConditions.titleContains(Title));
		
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		if(Title.contains("Contineo - Bringing Happiness to work and study places!"))
		{
		System.out.println("passed");
		}
		else
		{
		System.out.println("failed");
		}
	}

}
