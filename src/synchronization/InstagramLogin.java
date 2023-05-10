package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("username")).sendKeys("hss.satisha@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("12345678SA@sa");
		
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')]) [5]")).click();
		
	}

}
