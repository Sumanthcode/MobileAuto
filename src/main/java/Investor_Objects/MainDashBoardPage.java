package Investor_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class MainDashBoardPage {

	@FindBy(xpath="//android.view.View[@text='Discussion']")
	public WebElement discussion;
	
	
	
	public MainDashBoardPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
