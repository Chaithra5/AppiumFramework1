package com.AppiumFramework.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Amazon1 {
	AndroidDriver driver=null;
	DesiredCapabilities cap=null;
	@Test
	public void main() throws MalformedURLException, InterruptedException
	{
		cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.UDID, "33008b8e4242a271");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.aiv.AIVGatewayStartupActivity");
		cap.setCapability("noReset", "true");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
	
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='2']")).click();
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		int startx=(int)(size.width*0.50);
		int starty=(int)(size.height*0.90);
		int endy=(int)(size.height*0.20);
		driver.swipe(startx, starty, startx, endy, 1000);
		driver.findElement(By.xpath("//android.view.View[@text='OnePlus 7T | New Launch | Rs 1500 HDFC Cashback']")).click();
	}
}
