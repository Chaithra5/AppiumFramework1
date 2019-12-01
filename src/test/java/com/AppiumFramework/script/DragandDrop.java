package com.AppiumFramework.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragandDrop {
AndroidDriver driver=null;
DesiredCapabilities cap=null;

@Test
public void main() throws MalformedURLException, InterruptedException
{
	cap=new DesiredCapabilities();
	cap.setCapability("platformName", "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.1.0");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
	cap.setCapability(MobileCapabilityType.UDID, "33008b8e4242a271");
	cap.setCapability("appPackage", "com.mobeta.android.demodslv");
	cap.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
	cap.setCapability("noReset", "true");
	driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Basic usage playground']")).click();
	Thread.sleep(3000);
	TouchAction act = new TouchAction((MobileDriver)driver);
	act.longPress(80, 262).moveTo(22, 822).release().perform();
	//driver.tap(fingers, x, y, duration);
	//act.longPress(x, y)
}
}
