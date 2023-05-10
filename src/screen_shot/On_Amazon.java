package screen_shot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class On_Amazon {

	public static void main(String[] args) throws IOException 
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

					
			//step1- type casting
			TakesScreenshot ts = (TakesScreenshot) driver;

			//step2- access method
			File ram = ts.getScreenshotAs(OutputType.FILE);

			//step3- specify location
			File dest = new File("./photo/amazon.png");

			//step-4 copy & paste from RAM to specified location
			FileUtils.copyFile(ram,dest);

			driver.close();


	}

}
