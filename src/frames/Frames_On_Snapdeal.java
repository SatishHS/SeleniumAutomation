package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_On_Snapdeal {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9632279969");
		driver.findElement(By.xpath("(//i[contains(@class,'sd-icon sd-icon-delete-sign fnt-22')])")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("inputValEnter")).sendKeys("Phone");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		

	}

}
