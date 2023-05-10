package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/");
		
		//fullscreen
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		//minimize
		Thread.sleep(3000);
		driver.manage().window().fullscreen();

	}

}
