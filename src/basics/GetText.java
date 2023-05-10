package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("username1");
		driver.findElement(By.name("pwd")).sendKeys("password1");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'Username or Password')]")).getText();
		System.out.println(text);
		driver.close();
	}

}
