package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_All_Options_used {

	public static void main(String[] args) 
	{
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

			WebElement month = driver.findElement(By.name("birthday_month"));
			Select s = new Select(month);
			System.out.println("Is Month dropdown Multi-Select Type: "+ s.isMultiple());

			s.selectByIndex(9);

			List<WebElement> opt = s.getAllSelectedOptions();
			System.out.println(opt.size());
			for(WebElement b: opt)
			{
			System.out.println(b.getText());
			}


			List<WebElement> allopt = s.getOptions();
			System.out.println(allopt.size());
			for(WebElement b: allopt)
			{
			System.out.println(b.getText());
			}

		}
	}
}


