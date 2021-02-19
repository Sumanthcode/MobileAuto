package Investor_Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class EnterOtpPage {
	
	@FindBy(xpath="//android.widget.EditText[contains(@resource-id,'otp')]")
	public List<WebElement> otp;
	
	@FindBy(xpath="//android.widget.Button")
	public WebElement nextButton;
	
	public EnterOtpPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
