package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hss.satisha@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("satisha@HSS21041990");
		driver.findElement(By.name("login")).click();
		

	}

}
