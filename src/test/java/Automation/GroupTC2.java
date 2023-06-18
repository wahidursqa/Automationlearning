package Automation;

import org.testng.annotations.Test;
public class GroupTC2 {

	@Test(groups= {"smoke","functional"})
	public void test6() 
	{	
		System.out.println("Test6");
		
	}
	
	@Test(groups= {"sanity","smoke","functional"})
	public void test7() 
	{	
		System.out.println("Test7");
		
	}
	
	
	@Test(groups= {"smoke","functional"})
	public void test8() 
	{	
		System.out.println("Test8");
		
	}
	
	@Test(groups= {"smoke","functional"})
	public void test9() 
	{	
		System.out.println("Test9");
		
	}
	
	@Test(groups= {"sanity","smoke","functional"})
	public void test10() 
	{	
		System.out.println("Test10");
		
	}
}
