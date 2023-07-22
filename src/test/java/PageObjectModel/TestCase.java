package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	WebDriver driver;
	//LoginPage p;
	Page p;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
	}
	
	@Test(priority=1)
	void testLogo()
	{
		//lp=new LoginPage(driver);
		p=new Page(driver);
		
		Assert.assertEquals(p.checkLogoPresence(), true);
	}
	
	
	@Test(priority=2)
	void testLogin()
	{
		p.setUserName("Admin");
		p.setPassword("admin123");
		p.clickSubmit();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
				
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
