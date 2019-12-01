package com.AppiumFramework.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calendar1 {

	AndroidDriver driver = null;
	DesiredCapabilities cap = null;

	@Test
	public void main() throws MalformedURLException, InterruptedException {
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.1.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
		cap.setCapability(MobileCapabilityType.UDID, "33008b8e4242a271");
		cap.setCapability("appPackage", "com.android.calendar");
		cap.setCapability("appActivity", "com.android.calendar.AllInOneActivity");
		cap.setCapability("noReset", "true");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		// driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"View
		// mode Month Dropdown list October 2019 \"]")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Tasks
		// Not selected\"]/android.widget.TextView[1]")).click();
		Thread.sleep(1000);
		// driver.closeApp();
		// driver.installApp("C:\\Users\\User\\Desktop\\apk\\Bubble Shooter.apk");
		
		
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.90);
		int endx = (int) (size.width * 0.10);
		int starty = (int) (size.height * 0.50);

		driver.swipe(startx, starty, endx, starty, 2000);
	//	driver.swipe(startx, starty, endx, endy, duration);
	}
}
