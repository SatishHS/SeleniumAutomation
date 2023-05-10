package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectoronFB {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hss.satisha@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("satisha@HSS21041990");
		driver.findElement(By.cssSelector("button[value='1']")).click();
		//avoid numbers and alphanumeric values consider aplhabets, underscore(edit_new)
	}

}
