package Automation;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//This TC is used for Negative Testing

public class DataProviderTest8 {
	@Test(expectedExceptions = {NoSuchElementException.class})
	public void Login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.aiub.edu/");
		driver.findElement(By.id("abcd")).click();
		driver.quit();			
		
		
	}
	
}