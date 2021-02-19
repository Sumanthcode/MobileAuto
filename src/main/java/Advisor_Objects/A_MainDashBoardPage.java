package Advisor_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class A_MainDashBoardPage {
	
	@AndroidFindBy(xpath="//android.view.View[@text='START GIVING ADVICE']")
	public WebElement startGivingAdvice;
	
	public A_MainDashBoardPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

}
