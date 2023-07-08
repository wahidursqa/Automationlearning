package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProviderTest7 {
	@Test(dataProvider = "loginTestData")
	public void Login(String userName, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		Thread.sleep(5000);
		driver.quit();			
		
		
	}
	
	@DataProvider(parallel = true)
	
	public Object [][] LoginData() {
		Object [][] data = new Object [4][2];
		
		data [0][0] ="Admin";
		data [0][1] ="admin123";
		
		data [1][0] ="Admin";
		data [1][1] ="test123";
		
		data [2][0] ="Admin568";
		data [2][1] ="admin123";
		
		data [3][0] ="Admin568";
		data [3][1] ="test123";
		
		return data;
	}
	
}
