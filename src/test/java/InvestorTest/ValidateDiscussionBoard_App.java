package InvestorTest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Investor_Objects.DiscussionBoardPage;
import Investor_Objects.EnterOtpPage;
import Investor_Objects.LandingPage;
import Investor_Objects.LoginWithMobileNumberPage;
import Investor_Objects.MainDashBoardPage;
import Pickright.PickAuto.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class ValidateDiscussionBoard_App extends Base {
	String topicName="TestDB 101";
	String desc="for testing";
	DiscussionBoardPage d;
	AndroidDriver<AndroidElement> driver;
	@Test(priority=1)
	public void v1() throws IOException, InterruptedException
	{
		driver = capablities("pickrightApp");
		LandingPage l=new LandingPage(driver);
		l.useMobileNumber.click();
		LoginWithMobileNumberPage m=new LoginWithMobileNumberPage(driver);
		driver.hideKeyboard();
		m.mobileNumberField.sendKeys("6360245606");
		m.nextButton.click();
		EnterOtpPage e=new EnterOtpPage(driver);
	    for(int i=0;i<e.otp.size();i++) 
	    { 
		   e.otp.get(i).sendKeys("2");
	    }
		 
		e.nextButton.click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Discussion\"));");
		MainDashBoardPage mh=new MainDashBoardPage(driver);
		mh.discussion.click();
		d=new DiscussionBoardPage(driver);
		WebDriverWait wait=new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.visibilityOf(d.create));
		d.create.click();
		Thread.sleep(1000);
		d.topicTitleField.sendKeys(topicName);
		Thread.sleep(1000);
		d.topicDescriptionField.sendKeys(desc);
		d.sendButton.click();
		Thread.sleep(3000);
		Assert.assertTrue(d.topicNames.get(0).getText().replace("#","").equalsIgnoreCase(topicName));
		Assert.assertTrue(d.topicDesc.get(0).getText().equalsIgnoreCase(desc));

		
	}
	
	@Test(priority=2)
	public void validateTimeOfCreationOfTopicAndPostCount()
	{
		d.topicNames.get(0).click();
		Assert.assertTrue(d.postCountInsideTheTopic.getText().replaceAll("[^0-9]","").equals("0"));
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMM");
		String strDate = formatter.format(date);
		Assert.assertTrue(d.timeOfCreationOfTheTopic.getText().equalsIgnoreCase(strDate));
		Assert.assertTrue(d.noPostYet.isDisplayed());
	}
	
	@Test(priority=3)
	public void validateUploadAudioRecord() throws InterruptedException
	{
		d.audioRecorder.click();
		WebDriverWait wait=new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.visibilityOf(d.allowButton));
		d.allowButton.click();
		d.allowButton.click();
		Thread.sleep(4000);
		d.postButton.click();
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy,hh:mmaa");
		String strDate = formatter.format(date);
		System.out.println(strDate);
		Assert.assertTrue(d.timeOfCreationOfPost.getText().equalsIgnoreCase(strDate));
		if(d.followButton.getText().equalsIgnoreCase("+Follow"))
		{
			Assert.assertTrue(true);
			d.followButton.click();
			Assert.assertTrue(d.followButton.getText().equalsIgnoreCase("UnFollow"));
		}
		else if(d.followButton.getText().equalsIgnoreCase("UnFollow"))
		{
			Assert.assertTrue(true);
			d.followButton.click();
			Assert.assertTrue(d.followButton.getText().equalsIgnoreCase("+Follow"));
		}
		else
			Assert.assertTrue(false);

	
		
	}

}
