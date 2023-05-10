package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_On_Ebay 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));

		//step1- create object for Actions class
		Actions a = new Actions(driver);
		//step2- to perform mousehover
		a.moveToElement(ele).perform();
		
		//step3-after mousehovering click on the element
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
	}

}
