package Investor_Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class DiscussionBoardPage {

	
	@FindBy(xpath="//android.widget.TextView[@text='+ Create']")
	public WebElement create;
	
	@FindBy(xpath="(//android.widget.EditText[@class='android.widget.EditText'])")
	public WebElement topicTitleField;
	
	@FindBy(xpath="(//android.widget.EditText[@class='android.widget.EditText'])[2]")
	public WebElement topicDescriptionField;
	
	@FindBy(xpath="//android.widget.Button")
	public WebElement sendButton;
	
	@FindBy(xpath="//android.view.View[@text='My Topic']")
	public WebElement myTopic;
	
	@FindBy(xpath="//android.view.View[contains(@text,'#')]")
	public List<WebElement> topicNames;
	
	@FindBy(xpath="//android.view.View[@index='8']/android.view.View[@index='0']//android.view.View[@index='3']")
	public List<WebElement> topicDesc;
	
	@FindBy(xpath="//android.widget.TextView[@index='2']")
	public WebElement postCountInsideTheTopic;
	
	@FindBy(xpath="//android.widget.TextView[@index='1']")
	public WebElement timeOfCreationOfTheTopic;
	
	@FindBy(xpath="//android.view.View[@text='No Posts yet']")
	public WebElement noPostYet;
	
	@FindBy(xpath="//android.view.View/android.view.View[@index='4']/android.widget.Image[@index='2']")
	public WebElement audioRecorder;
	
	@FindBy(xpath="//android.widget.Button[@text='ALLOW']")
	public WebElement allowButton;
	
	@FindBy(xpath="//android.view.View/android.view.View[@index='4']/android.view.View[@index='4']")
	public WebElement postButton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Cancel']")
	public WebElement audioRecorderCancelButton;
	
	@FindBy(xpath="//android.view.View/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='4']")
	public WebElement userNameOnPost;
	
	@FindBy(xpath="//android.view.View/android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='5']")
	public WebElement timeOfCreationOfPost;
	
	@FindBy(xpath="//android.view.View/android.view.View[@index='3']//android.view.View[@index='6']/android.widget.TextView")
	public WebElement followButton;
	
	//	
	//android.view.View/	android.view.View[@index='3']/android.view.View[@index='0']/android.view.View[@index='4']
	
	
	
	public DiscussionBoardPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
