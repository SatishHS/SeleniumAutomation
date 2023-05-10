package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContineoLogin 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://sims.nie.ac.in/sims/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("username")).sendKeys("satishhs@nie.ac.in");
		driver.findElement(By.name("passwd")).sendKeys("H@s@s@21041990");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String Title = driver.getTitle();
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
