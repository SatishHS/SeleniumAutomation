package webElements_Getters;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginbuttonLocationUsinggetLocation 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		Point loc = button.getLocation();
		int x = loc.getX();
		int y = loc.getY();

		System.out.println(x +" is the X co-ordinate of the Log IN Button");
		System.out.println(y +" is the Y co-ordinate of the Log IN Button");

		driver.close();

	}

}
