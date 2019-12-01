package com.AppiumFramework.script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.AppiumFramework.generic.GlobalMethod;

import io.appium.java_client.android.AndroidDriver;

public class Amazon extends GlobalMethod{

	
	@Test
	public void main() throws MalformedURLException, InterruptedException
	{
		setData("search","rings");
		System.out.println("*************");
		
	}
}
