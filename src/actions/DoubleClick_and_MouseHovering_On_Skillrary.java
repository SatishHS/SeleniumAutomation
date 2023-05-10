package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_and_MouseHovering_On_Skillrary {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("course"));
		Thread.sleep(5000);
		//step1- create object for Actions class
		Actions a = new Actions(driver);
		//step2- to perform mouse hovering
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		//step3- to perform double click
		Thread.sleep(3000);
		a.doubleClick(click).perform();
	}

}
