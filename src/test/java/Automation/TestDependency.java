package Automation;
import org.testng.annotations.*;

public class TestDependency {

	static String trackingnumber = null;
	@Test()
	public void Createshipment()
	{
		System.out.println(5/0);
		System.out.println("CreateShipment");
		trackingnumber = "ABCD87878OLHM";
		
	}
	
	@Test(dependsOnMethods = {"Createshipment"})
	public void Trackshipment() throws Exception
	{
		if (trackingnumber !=null)
			System.out.println("Trackshipment");
		else
			throw new Exception("Invalid Tracking Number");
	}
	
	@Test(dependsOnMethods = {"Createshipment"})
	public void Cancelshipment() throws Exception
	{
		if (trackingnumber !=null)
			System.out.println("Cancelshipment");
		else
			throw new Exception("Invalid Tracking Number");
	}
	
}
