package synchronizationExplicitly;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?");

		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement user = driver.findElement(By.name("username"));
		w.until(ExpectedConditions.visibilityOf(user)).sendKeys("hss.satisha@gmail.com");
		
		WebElement pass = driver.findElement(By.name("password"));
		w.until(ExpectedConditions.visibilityOf(pass)).sendKeys("12345678SA@sa");
		
		WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')]) [5]"));
		w.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleContains(title));
		
		System.out.println(title);
	
	}

}
