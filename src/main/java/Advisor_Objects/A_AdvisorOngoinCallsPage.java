package Advisor_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class A_AdvisorOngoinCallsPage {
	
	@AndroidFindBy(xpath="//android.view.View[@text='Create Calls']")
	public WebElement createCallButton;
	
	public A_AdvisorOngoinCallsPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

}
