package Investor_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginWithMobileNumberPage {
	
	@FindBy(className = "android.widget.EditText")
	public WebElement mobileNumberField;
	
	@FindBy(xpath="//android.widget.Button")
	public WebElement nextButton;
	
	public LoginWithMobileNumberPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
