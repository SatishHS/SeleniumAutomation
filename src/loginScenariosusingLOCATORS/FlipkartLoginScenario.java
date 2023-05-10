package loginScenariosusingLOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginScenario 
{

	public static void main(String[] args) 
	{
		//step1: open browser
		WebDriver driver = new ChromeDriver();

		//step2 : maximize browser
		driver.manage().window().maximize();

		//step3: enter URl
		driver.get("https://www.flipkart.com/"); 

		//step4: enter valid username
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9632279969");

		//step5: enter valid password
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("satisha21041990");

		//step6: click on login button
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		//step7:get title of the page
		String title = driver.getTitle();

		//step8: get the URL of the application
		String URL = driver.getCurrentUrl();

		//print the Title & URl
		System.out.println(title);
		System.out.println(URL);

		//step9: verification
		if(title.contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
		System.out.println("Passed : Home page is displayed");
		}
		else
		{
		System.out.println("Failed : Home page is not displayed");
		}

		//step10: close the application
		driver.close();

	}

}
