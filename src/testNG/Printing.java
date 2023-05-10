package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Printing 
{
	@Test
	public void demo()
	{
		Reporter.log("hello selenium",true);
		Reporter.log("hello java");
	}


}
