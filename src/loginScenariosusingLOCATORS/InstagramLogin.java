package loginScenariosusingLOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("hss.satisha@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("12345678SA@sa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')]) [5]")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
