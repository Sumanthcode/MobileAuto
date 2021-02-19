package Advisor_Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class A_EnterOtpPage {
	
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'otp')]")
	public List<WebElement> otp;
	
	@AndroidFindBy(xpath="//android.widget.Button")
	public WebElement nextButton;
	
	public A_EnterOtpPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}


}
