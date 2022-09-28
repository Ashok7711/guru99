package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class guru99testcase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V4/");
			
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.user.sendKeys("mngr441705");
		loginpage.pasd.sendKeys("AdArYde");
		loginpage.loginbtn.click();
		
		

	}

}
