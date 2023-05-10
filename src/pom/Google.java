package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement ele = driver.findElement(By.name("q"));
		
		GoogleSB g = new GoogleSB(driver);
		
		driver.navigate().refresh();
		
//		ele.sendKeys("Phone");
		
		g.search("phone");
		

	}

}
