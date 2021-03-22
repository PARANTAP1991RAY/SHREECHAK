package POMTests;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import POMClasses.LoginHDFC;
public class LoginTC {

	WebDriver driver;
	LoginHDFC objlogin;
	
	@BeforeTest
	@Parameters("browser")
	public void browsersetup(String browser)
	{	if(browser.equalsIgnoreCase("chrome")){
		driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
	}
	
	@Test
	public void loginfunction()
	{
		objlogin=new LoginHDFC(driver);
		objlogin.finallylogintoHDFC("Kolkata (CCU)", "Mumbai (BOM)");
	}

}


