package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath  = "/html/body/form/table/tbody/tr[1]/td[2]/input")
	public WebElement user;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
	public WebElement pasd;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	public WebElement loginbtn;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	}

