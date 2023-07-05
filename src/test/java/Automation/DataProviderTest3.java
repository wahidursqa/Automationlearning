package Automation;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest3 {
	@Test(dataProvider = "dp1")
	public void Login(String[] s) throws Exception {
		for (int i=0; i < s.length; i++) {
		System.out.println(s[i]);
				
		}
		System.out.println(">>>>>");
		
	}
	
	
	
	
	// Object Multiple dimensional array
	
	@DataProvider()
	
	public String [][] dp1() {
		String [][] data = new String [] [] {
		
		{"abc","123"},
		{"xyz","456"},
		{"pqr", "789"}
		
		
	};
		return data;
	
}
		
	
}