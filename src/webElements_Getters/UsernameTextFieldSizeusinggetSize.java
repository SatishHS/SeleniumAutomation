package webElements_Getters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernameTextFieldSizeusinggetSize 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("email"));
		Dimension s = ele.getSize();
		int h = s.getHeight();
		int w = s.getWidth();

		System.out.println(h +" is the height of the Username TF");
		System.out.println(w +" is the width of the Username TF");

		driver.close();

	}

}
