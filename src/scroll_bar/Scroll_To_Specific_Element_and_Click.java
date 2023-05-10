package scroll_bar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_To_Specific_Element_and_Click {

	public static void main(String[] args) throws InterruptedException {
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
//			driver.get("https://www.amazon.com/");
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//			WebElement ele = driver.findElement(By.xpath("//img[@alt='Shop Laptops & Tablets']"));
//
//			Point Loc = ele.getLocation();
//			int x= Loc.getX();
//			int y= Loc.getY();
//					
			//type casting
			JavascriptExecutor js =  (JavascriptExecutor) driver;

			//scrolling top to bottom
//			js.executeScript("window.scrollTo("+x+","+y+")");
			
			js.executeScript("window.scrollTo(0,500)");
			
			//to click on the element if we get element not clickable exception/ not interceptable exception
//			js.executeScript("arguments[0].click();", ele);
		
		}
		

	}

}
