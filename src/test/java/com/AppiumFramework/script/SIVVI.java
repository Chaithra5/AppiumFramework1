package com.AppiumFramework.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SIVVI {

	AndroidDriver driver;
	DesiredCapabilities cap;
	@Test
	public void sivviScript() throws MalformedURLException, InterruptedException
	{
		cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
		cap.setCapability(MobileCapabilityType.UDID, "33008b8e4242a271");
		cap.setCapability("appPackage", "com.sivvi.app");
	cap.setCapability("appActivity", ".MainActivity");
	cap.setCapability("noReset", "true");
	driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	Thread.sleep(9000);
	driver.tap(1, 278, 398, 1000);
	driver.tap(1, 197, 602, 1000);

	}
	
	                
}
