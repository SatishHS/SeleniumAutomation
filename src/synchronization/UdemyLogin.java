package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyLogin 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/join/login-popup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.name("email")).sendKeys("hss.satisha@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("satisha21041990");
		//not given submit button as i don't have valid account
		String Title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(Title);
		System.out.println(URL);
		if(Title.contains("Login"))
		{
		System.out.println("Passed: Home page is displayed");
		}
		else
		{
		System.out.println("Failed: Home page is not displayed");
		}
		
		driver.close();
	}

}
