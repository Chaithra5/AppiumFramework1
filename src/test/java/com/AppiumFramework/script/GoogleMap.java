package com.AppiumFramework.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class GoogleMap{
AndroidDriver driver=null;
DesiredCapabilities cap=null;
	
	@Test
	public void main() throws MalformedURLException, InterruptedException
	{
		cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
		cap.setCapability(MobileCapabilityType.UDID, "33008b8e4242a271");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		cap.setCapability("noRest", "true");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(8000);
		TouchAction act= new TouchAction((MobileDriver)driver);
		act.longPress(259,622).moveTo(98, 476).wait(1000);
		
		TouchAction act1=new TouchAction((MobileDriver)driver);
		act1.longPress(397,725).moveTo(594, 875).wait(1000);
		
		MultiTouchAction mact=new MultiTouchAction((MobileDriver)driver);
		mact.add(act).add(act1).perform();

	}
}
