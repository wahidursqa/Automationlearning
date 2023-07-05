package Automation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest5 {
	@Test(dataProvider = "dp1")
	public void Login(Object[] s) throws Exception {
		
		System.out.println(s[0]+" >> " +s[1]);
				
		
		
	}
	
	
	
	
	// Iterator Object Array
	
	@DataProvider()
	
	public Iterator<Object[]> dp1() {
		Set<Object[]> data = new HashSet<>(); 
		data.add(new Object[] {"abcd","xyz"});
		data.add(new Object[] {"pqrs","uvw"});
		
		
		return data.iterator();
	
}
}
		
	
