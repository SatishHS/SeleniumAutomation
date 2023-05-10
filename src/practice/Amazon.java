package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[1]/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("hss.satisha@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("H@s@s@21041990");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sc-saved-cart-list-caption-text\"]")).click();
	}

}
