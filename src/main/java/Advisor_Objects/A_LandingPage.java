package Advisor_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class A_LandingPage {

	@AndroidFindBy(xpath="//android.view.View[@text='Advisors Login']")
	public WebElement advisorLogin;
	
	public A_LandingPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
}
