package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test (priority = -1, invocationCount = 2)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test 
	public void settings()
	{
		Reporter.log("settings",true);
	}
	
	@Test (invocationCount = 3)
	public void chats()
	{
		Reporter.log("chats",true);
	}

}
