package com.AppiumFramework.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
///Using touch counter app
public class Multitouch {
	AndroidDriver driver = null;
	DesiredCapabilities cap = null;

	@Test
	public void main() throws MalformedURLException, InterruptedException 
	{
		cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.1.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
		cap.setCapability(MobileCapabilityType.UDID, "33008b8e4242a271");
		cap.setCapability("appPackage", "org.amrgames.touchcounter");
		cap.setCapability("appActivity", "com.unity3d.player.UnityPlayerActivity");
		cap.setCapability("noReset", "true");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		TouchAction act=new TouchAction((MobileDriver)driver);
		act.longPress(40,100, 2000).moveTo(615, 700).waitAction(2000);
		
		TouchAction act1=new TouchAction((MobileDriver)driver);
		act1.longPress(612,1217, 2000).moveTo(102, 256).waitAction(2000);
		
		MultiTouchAction mact=new MultiTouchAction((MobileDriver)driver);
		
		mact.add(act).add(act1).perform();
		
		
		
}
}
