package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering_On_Luxire {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.luxire.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//button[@class='drawerbtn']"));
		Thread.sleep(5000);
		//step1- create object for Actions class
		Actions a = new Actions(driver);
		//step2- to perform mousehover
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[text()='All Pants'])[2]")).click();
		

	}

}
