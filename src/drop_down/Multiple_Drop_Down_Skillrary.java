package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Drop_Down_Skillrary {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd = driver.findElement(By.id("cars"));

		Select s = new Select(dd);
		Thread.sleep(5000);
		s.selectByIndex(0);
		Thread.sleep(5000);
		s.selectByValue("99");
		Thread.sleep(5000);
		s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");

		List<WebElement> option = s.getOptions();
		System.out.println(option.size());

		for(WebElement b:option)
		{
		System.out.println(b.getText());
		}
		
		Thread.sleep(5000);
		s.deselectByIndex(0);
		Thread.sleep(5000);
		s.deselectByValue("99");
		Thread.sleep(5000);
		s.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");


	}

}
