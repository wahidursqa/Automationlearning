package Automation;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest2 {
	@Test(dataProvider = "dp1")
	public void Login(Integer i) throws Exception {
		System.out.println(i);
				
		
		
	}
	
	
	//String single dimensional array
	/*
	@DataProvider()
	
	public String[] dp1() {
		String [] data = new String [] {
		
		"abcd",
		"xyz",
		"pqr"
		
		
	};
		return data;
	
}
	
*/	

	//Integar single dimensional array
	/*
	@DataProvider()
	
	public Integer[] dp1() {
		Integer [] data = new Integer [] {
		
		1,
		2,
		3
		
		
	};
		return data;
	
}
	
*/
	
	//Object single dimensional array
	
	@DataProvider()
	
	public Object [] dp1() {
		Object [] data = new Object [] {
		
		1,
		"xyz",
		"pqr"
		
		
	};
		return data;
	
}
		
	
}