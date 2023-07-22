package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

	public WebDriver driver;
	
	//Constructor
	Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
		
	// WebElements Locators+identification
	@FindBy(xpath="//img[@alt='company-branding']") 
	//@FindBy(how=How.XPATH, using="//img[@alt='company-branding']")
	WebElement img_logo;
	
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(css="input[placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_submit;
		
	
	
	//Action methods
	
	public void setUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		btn_submit.click();
	}
	
	public boolean checkLogoPresence()
	{
		boolean status=img_logo.isDisplayed();
		return status;
	}
	
	
}
