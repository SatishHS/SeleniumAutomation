package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_dropdown_isMultiple_Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://amazon.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

			Select s = new Select(dropdown);
			s.selectByIndex(1);
			Thread.sleep(3000);
			s.selectByValue("search-alias=computers-intl-ship");
			Thread.sleep(3000);
			s.selectByVisibleText("Men's Fashion");
			
			System.out.println("DropDown is Multi"
					+ " select type: " + s.isMultiple());
			
			List<WebElement> option = s.getOptions();
			System.out.println(option.size());
			
			for(WebElement b:option)
			{
				System.out.println(b.getText());
			}
			
			if(s.isMultiple())
			{
				s.deselectAll();
			}
			else
			{
				System.out.println("It is not a Multi Select Drop Down");
			}
			
			List<WebElement> opt = s.getAllSelectedOptions();
			System.out.println(opt.size());
			
			for(WebElement b:opt)
			{
				System.out.println(b.getText());
			}
			
			driver.close();
	}
}
