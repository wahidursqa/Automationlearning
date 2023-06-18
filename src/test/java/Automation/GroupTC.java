package Automation;

import org.testng.annotations.Test;
public class GroupTC {

	@Test(groups= {"sanity","smoke","functional"})
	public void test1() 
	{	
		System.out.println("Test1");
		
	}
	
	@Test(groups= {"sanity","smoke","functional"})
	public void test2() 
	{	
		System.out.println("Test2");
		
	}
	
	
	@Test(groups= {"sanity","smoke","functional"})
	public void test3() 
	{	
		System.out.println("Test3");
		
	}
	
	@Test(groups= {"sanity","smoke","functional"})
	public void test4() 
	{	
		System.out.println("Test4");
		
	}
	
	@Test(groups= {"smoke","functional"})
	public void test5() 
	{	
		System.out.println("Test5");
		
	}
}
