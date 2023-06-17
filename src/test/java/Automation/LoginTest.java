package Automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	@BeforeTest
	public void LoginToApplication()
	{
		System.out.println("Login to application");
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("Connect to DB");
	}
	
	@AfterMethod
	public void DisconnectFromDB()
	{
		System.out.println("Disconnect from DB");
	}
	
	@Test(priority=1)
	public void aTest()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=2)
	public void bTest()
	{
		System.out.println("Test2");
	}

	@AfterTest
	public void LogoutFromApplication()
	{
		System.out.println("Logout from application");
		
	}
}
