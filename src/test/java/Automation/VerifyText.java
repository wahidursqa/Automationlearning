package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyText {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Launch browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the page
    }

    @Test
    public void verifyTitle() throws InterruptedException {
        // Open URL on the browser
        driver.get("https://www.ebay.com/");
        Thread.sleep(5000);

        // Title validation
        String exp_title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String act_title = driver.getTitle();
        System.out.println("Verifying Title");
        
        Assert.assertEquals(act_title, exp_title, "Title Verification Failed"); // expected result, actual result, custom message like "Title verification failed"
        
        
        //Text validation
        String exp_text = "Search";
        String act_text = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
        System.out.println("Verifying Text");
        Assert.assertEquals(exp_text, act_text, "Text Verification Failed"); // expected result, actual result, custom message like "Text verification failed"
        
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
    	System.out.println("Closing browser");
        driver.quit();
    }
}