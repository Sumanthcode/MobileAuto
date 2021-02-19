package Advisor_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class A_LoginWithMobilePage {
	
	@AndroidFindBy(className = "android.widget.EditText")
	public WebElement mobileNumberField;
	
	@AndroidFindBy(xpath="//android.widget.Button")
	public WebElement nextButton;
	
	public A_LoginWithMobilePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

}
