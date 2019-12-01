package com.AppiumFramework.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Bluestone1 {
	AndroidDriver driver=null;
	DesiredCapabilities cap=null;
	
	@Test 
	public void main() throws MalformedURLException
	{
		cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.UDID,"33008b8e4242a271");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		cap.setCapability("noReset", "true");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	}

}
