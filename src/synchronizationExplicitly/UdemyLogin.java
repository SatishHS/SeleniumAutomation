package synchronizationExplicitly;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UdemyLogin 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/join/login-popup/");
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Log in']"));
		w.until(ExpectedConditions.elementToBeClickable(login)).click();
	
		WebElement email = driver.findElement(By.name("email"));
		w.until(ExpectedConditions.visibilityOf(email)).sendKeys("hss.satisha@gmail.com");
		
		WebElement pass = driver.findElement(By.id("id_password"));
		w.until(ExpectedConditions.visibilityOf(pass)).sendKeys("satisha21041990");
		
		
		//not given submit button as i don't have valid account
		String Title = driver.getTitle();
		w.until(ExpectedConditions.titleContains(Title));
		
		String URL = driver.getCurrentUrl();
		System.out.println(Title);
		System.out.println(URL);
		if(Title.contains("Login"))
		{
		System.out.println("Passed: Home page is displayed");
		}
		else
		{
		System.out.println("Failed: Home page is not displayed");
		}
		
		driver.close();
	}

}
