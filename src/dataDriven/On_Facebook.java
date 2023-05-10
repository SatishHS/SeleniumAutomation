package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class On_Facebook {

	public static void main(String[] args) throws IOException 
	{
		Properties pdata = new Properties();
		FileInputStream fip = new FileInputStream("./data.properties");
		pdata.load(fip);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(pdata.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pdata.getProperty("password"));
		
	}

}
