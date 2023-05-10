package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTextBox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchtb = driver.findElement(By.xpath("//input[@name='q']"));
		searchtb.sendKeys("seleni");
		
		Thread.sleep(3000); //mandatory to give to load
		
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		//count of the options using size()
		System.out.println(ele.size());

		//to print the text
		for(WebElement b : ele)
		{
		System.out.println(b.getText());
		}
		driver.close();
	}

}
