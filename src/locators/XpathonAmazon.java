package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathonAmazon 
{
	public static void main(String[] args) 
	{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hss.satisha@gmail.com");
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("H@s@s@21041990");
			driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}

}