package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_popup {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		open new tab in the same browser
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.irctc.com/");

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
//		closes only child tab
		driver.close();
//		closes both child and parent
		driver.quit();


	}

}
