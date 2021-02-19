package Pickright.PickAuto;

import java.beans.DesignMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	
	AndroidDriver<WebElement> driver;
	public AndroidDriver<AndroidElement> capablities(String app) throws IOException
	{
		
		FileInputStream fl=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Pickright\\PickAuto\\global.properties");
				Properties prop=new Properties();
				prop.load(fl);
				
		File f = new File("src");
		File fs = new File(f, (String) prop.get(app));
		DesiredCapabilities cap=new DesiredCapabilities();
		String device=(String) prop.get("device");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,device);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
}
