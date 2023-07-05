package Automation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest4 {
	@Test(dataProvider = "dp1")
	public void Login(String s) throws Exception {
		
		System.out.println(s);
				
		
		
	}
	
	
	
	
	// Iterator Object 
	
	@DataProvider()
	
	public Iterator<String> dp1() {
		Set<String> data = new HashSet<>(); 
		data.add("abcd");
		data.add("xyz");
		return data.iterator();
	
}
		
	
}