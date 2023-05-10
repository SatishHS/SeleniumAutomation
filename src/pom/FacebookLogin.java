package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Facebook fb = new Facebook(driver);
		fb.username("hss.satisha@gmail.com");
		fb.password("satisha21041990");
		fb.login();
		
		driver.navigate().back();
		driver.close();
	}

}
