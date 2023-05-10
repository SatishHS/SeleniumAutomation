package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/ref=av_auth_return_redir");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		

	}

}
