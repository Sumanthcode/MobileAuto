package Advisor_Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class A_EquityCashCreateCallPage {

	@AndroidFindBy(xpath="//android.view.View[@text='Scrip Name *']/following-sibling::android.widget.EditText")
	public WebElement scripNameField;
	
	@AndroidFindBy(xpath="//android.view.View[contains(@text,'TVS')]")
	public List<WebElement> scripNameAutoSugessions;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']//android.view.View[@index='2']")
	public WebElement cmpValue;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Buy']")
	public WebElement callTypeBuy;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Sell']")
	public WebElement callTypeSell;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Market Price']")
	public WebElement marketPriceRadioButton;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Recommended Price']")
	public WebElement recommendedPriceRadioButton;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Recommended Price']/following-sibling::android.widget.EditText[@index='9']")
	public WebElement recommendedPriceField;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Stop Loss *']/following-sibling::android.widget.EditText")
	public WebElement stopLossField;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Target*']/following-sibling::android.widget.EditText")
	public WebElement targetField;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Buy Range *']/following-sibling::android.widget.EditText")
	public WebElement minimumRangeField;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Buy Range *']/following-sibling::android.widget.EditText/following-sibling::android.widget.EditText")
	public WebElement maximumRangeField;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Quantity']/following-sibling::android.widget.EditText")
	public WebElement quantityField;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']//android.view.View[@text='Intra Day']")
	public WebElement intradayTimeFrame;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']//android.view.View[@text='1 Week']")
	public WebElement oneWeekTimeFrame;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']//android.view.View[@text='2 Weeks']")
	public WebElement threeWeekTimeFrame;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']//android.view.View[@text='1 Month']")
	public WebElement oneMonthTimeFrame;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']//android.view.View[@text='Particular Date']")
	public WebElement particularDateTimeFrame;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']//android.view.View[@text='Low']")
	public WebElement lowRisk;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']//android.view.View[@text='Medium']")
	public WebElement mediumRisk;
	
	@AndroidFindBy(xpath="//android.view.View[@index='3']//android.view.View[@text='High']")
	public WebElement highRisk;
	
	@AndroidFindBy(xpath="//android.widget.Button")
	public WebElement publishCallButton;
	
	
	
	public A_EquityCashCreateCallPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
}
