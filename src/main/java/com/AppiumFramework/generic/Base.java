package com.AppiumFramework.generic;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	GlobalVariable gv= new GlobalVariable();
	AndroidDriver driver=null;
	DesiredCapabilities cap=null;

	public void init() throws FileNotFoundException, IOException
	{
		gv.mobile= new Properties();
		gv.mobile.load(new FileInputStream("C:\\Users\\User\\Documents\\chaithra_pgm\\AppiumFramework\\src\\main\\resources\\mobile.properties"));
	}

	public void enterURL() throws MalformedURLException
	{
		cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.UDID, "33008b8e4242a271");
		cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		cap.setCapability("appActivity", "com.amazon.mShop.aiv.AIVGatewayStartupActivity");
		
		//cap.setCapability("appPackage", "com.sivvi.app");
		// cap.setCapability("appActivity", ".MainActivity");
		 
		cap.setCapability("noReset", "true");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
	
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	}
	
	@BeforeSuite()
	public void BeforeSuite() throws FileNotFoundException, IOException
	{
		init();
	}
	
	@BeforeMethod()
	public void Bmethod() throws MalformedURLException
	{
		enterURL();
	}
}

