package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Drop_Down_MTR_Menu {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Manual%20Testing/Q%20Spiders%202022/Selenium_%20Bharani_%20(01%20Sept%20to%20)/Programs/MTR%20Menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd = driver.findElement(By.id("MTR"));

		Select s = new Select(dd);
		s.selectByIndex(2);
		s.selectByValue("S");
		s.selectByVisibleText("Coffee Tea");

		List<WebElement> option = s.getOptions();
		System.out.println(option.size());

		for(WebElement b:option)
		{
		System.out.println(b.getText());
		}
		
		Thread.sleep(5000);
		s.deselectByIndex(2);
		Thread.sleep(5000);
		s.deselectByValue("S");
		Thread.sleep(5000);
		s.deselectByVisibleText("Coffee Tea");

	}

}
