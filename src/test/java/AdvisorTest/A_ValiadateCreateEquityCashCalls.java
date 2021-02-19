package AdvisorTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Advisor_Objects.A_AdvisorOngoinCallsPage;
import Advisor_Objects.A_CategorySelectionPage;
import Advisor_Objects.A_EnterOtpPage;
import Advisor_Objects.A_EquityCashCreateCallPage;
import Advisor_Objects.A_LandingPage;
import Advisor_Objects.A_LoginWithMobilePage;
import Advisor_Objects.A_MainDashBoardPage;
import Pickright.PickAuto.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class A_ValiadateCreateEquityCashCalls extends Base {
	
	AndroidDriver<AndroidElement> driver;
	String num="6360245606";
	@Test
	public void v1() throws AWTException, IOException, InterruptedException
	{
		driver = capablities("pickrightApp");
		A_LandingPage l=new A_LandingPage(driver);
		l.advisorLogin.click();
		A_LoginWithMobilePage m=new A_LoginWithMobilePage(driver);
		driver.hideKeyboard();
		m.mobileNumberField.sendKeys(num);
		m.nextButton.click();
		A_EnterOtpPage e=new A_EnterOtpPage(driver);
		for(int i=0;i<e.otp.size();i++)
		{
			e.otp.get(i).sendKeys("7");
		}
		e.nextButton.click();
		A_MainDashBoardPage d=new A_MainDashBoardPage(driver);
		d.startGivingAdvice.click();
		A_CategorySelectionPage c=new A_CategorySelectionPage(driver);
		c.equityCash.click();
		A_AdvisorOngoinCallsPage ad=new A_AdvisorOngoinCallsPage(driver);
		ad.createCallButton.click();
		A_EquityCashCreateCallPage eq=new A_EquityCashCreateCallPage(driver);
		eq.scripNameField.sendKeys("TVS");
		eq.scripNameField.click();
		eq.scripNameAutoSugessions.get(0).click();
		WebDriverWait wait=new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.visibilityOf(eq.cmpValue));
		double cmp = Double.parseDouble(eq.cmpValue.getText().replace("\u20B9","").replace(",",""));
		eq.callTypeBuy.click();
	//	eq.marketPriceRadioButton.click();
		Thread.sleep(3000);
		eq.recommendedPriceRadioButton.click();
		eq.recommendedPriceField.click();
		Thread.sleep(3000);
	//	driver.hideKeyboard();
		eq.recommendedPriceField.sendKeys("322");
		eq.stopLossField.sendKeys("434");
	//	((AndroidDrive) rdriver).pressKey(new KeyEvent(AndroidKey.ENTER));
	//	eq.recommendedPriceField.sendKeys(String.valueOf(cmp+2.0));
		
		
		
		
	
		
		
	}
}
