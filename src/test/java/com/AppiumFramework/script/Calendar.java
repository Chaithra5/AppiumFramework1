package com.AppiumFramework.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calendar {
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
		cap.setCapability("appPackage", "com.android.calendar");
		cap.setCapability("appActivity", "com.android.calendar.AllInOneActivity");
		
		cap.setCapability("noReset", "true");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		System.out.println(driver.currentActivity());//current application
		Thread.sleep(2000);
		driver.closeApp();  //Close application
		Thread.sleep(2000);
		driver.openNotifications();// swipe down the notification bar
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.BACK); /// swipe up the notification bar
  // NativeNotificationPage notification = new NativeNotificationPage(driver);
		Thread.sleep(2000);
		
	System.out.println(	driver.getContext());   ///Checking the type of the application
	//System.out.println(driver.getConnection());   //data connection 
	Thread.sleep(2000);
System.out.println(	driver.isAppInstalled("com.sec.android.app.popupcalculator")); //checking the app installed or not
Thread.sleep(2000);
//driver.removeApp("com.google.android.apps.wallpaper");
//Thread.sleep(2000);
driver.setConnection(Connection.ALL);// turning ON the data.
Thread.sleep(3000);
driver.setConnection(Connection.NONE);
//Thread.sleep(2000);
		//driver.installApp("C:\\Users\\User\\Desktop\\apk\\Bubble Shooter.apk");

	}

}
