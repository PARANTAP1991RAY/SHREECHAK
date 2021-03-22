package POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHDFC {
WebDriver driver;
By roundtrip=By.id("gi_roundtrip_label");
By origcity= By.id("gosuggest_inputSrc");
By endcity=By.id("gosuggest_inputDest");
By searcflight=By.id("gi_search_btn");
public void setusername(String depcity)
{
driver.findElement(origcity).sendKeys(depcity);
}
public void setpwd(String landcity)
{
	driver.findElement(endcity).sendKeys(landcity);
}
public void clicktriptype()
{
	driver.findElement(roundtrip).click();;
}
public void clickserachflight()
{
	driver.findElement(searcflight).click();;
}
public LoginHDFC(WebDriver driver)
{
	this.driver=driver;
}

public void finallylogintoHDFC(String username,String password)
{
	this.setusername(username);
	this.setpwd(password);
	this.clicktriptype();
	this.clickserachflight();
}
}

