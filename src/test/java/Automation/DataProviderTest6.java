package Automation;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest6 {
	@Test(dataProvider = "dp1")
	public void Login(String[] s) throws Exception {
		
		System.out.println(s);
				
		}
		
		
	
	
	
	
	
	// Object Multiple dimensional array
	
	@DataProvider(indices= {0,2})
	
	public String [] dp1() {
		String [] data = new String [] {
		
		"abc",
		"xyz",
		"pqr"
		
		
	};
		return data;
	
}
		
	
}