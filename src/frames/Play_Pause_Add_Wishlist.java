package frames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Play_Pause_Add_Wishlist {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("core java for selenium");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//img[@id='image-3'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
		Thread.sleep(5000);
//		switch control to frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		
//		switch back control to default from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();
		
//		Program didn't Work

	}

}
