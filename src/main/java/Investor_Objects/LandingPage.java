package Investor_Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LandingPage {

	@FindBy(xpath="//android.widget.TextView[@text='Use Mobile Number']")
	public WebElement useMobileNumber;
	
	public LandingPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
