package com.AppiumFramework.generic;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class GlobalMethod extends Base{
 
	By by;
	
	public WebElement elementsMethod(String element)
	{
		String[] locator=gv.mobile.getProperty(element).split("-");
		
		if(locator[0].equals("id"))
		{
			by=by.id(locator[1]);
		}else if(locator[0].equals("cssSelector"))
		{
			by=By.cssSelector(locator[1]);
		}else if(locator[0].equals("className"))
		{
			by=By.className(locator[1]);
		}else if(locator[0].equals("linkText"))
		{
			by=By.linkText(locator[1]);
		}else if(locator[0].equals("name"))
		{
			by=By.name(locator[1]);
			}else if(locator[0].equals("tagName"))
		{
			by=By.tagName(locator[1]);
		}else if(locator[0].equals("xpath"))
		{
			by=By.xpath(locator[1]);
		}
		
		return driver.findElement(by);
	}
	
	public void setData(String ele,String data)
	{
		elementsMethod(ele).sendKeys(data);
	}
	
	public void click(String ele)
	{
		elementsMethod(ele).click();
	}

	public void swipe()
	{
		Dimension size = driver.manage().window().getSize();
		int startx=(int)(size.width*0.50);
		int starty=(int)(size.height*0.90);
		int endy=(int)(size.height*0.20);
		driver.swipe(startx, starty, startx, endy, 1000);
		//driver.swipe(startx, starty, endx, endy, duration);
	}
	
	public void mobileScreenSwipe()
	{
		Dimension size= driver.manage().window().getSize();
         int startx=(int)(size.width*0.90);
         int endx=(int) (size.width*0.10);
         int starty=(int)(size.height*0.30);
         
		driver.swipe(startx, starty, endx, starty, 1000);
	}
	
	public void screenShot(String ele) throws IOException
	{
		File src = elementsMethod(ele).getScreenshotAs(OutputType.FILE);
		  File dest = new File("./Screenshot/photo.png");
		FileUtils.copyFile(src, dest);
		}
}
