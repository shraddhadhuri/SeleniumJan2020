package com.VTiger.Common;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;





import org.apache.commons.io.FileUtils;
public class GenericMethods {
	
	public static String getFileName()
	{
		DateFormat format=new SimpleDateFormat("yyyyMMddhhmmss");
		Date date=new Date();
		String datestr=format.format(date);
		return datestr;
	}
	
	public static String getScreenShot(String TestName,WebDriver driver) throws Exception
	{
		DateFormat format=new SimpleDateFormat("yyyyMMddhhmmss");
		Date date=new Date();
		String datestr=format.format(date);
		String filename=System.getProperty("user.dir")+"\\src\\test\\java\\com\\VTiger\\Report\\Screenshot\\"+TestName+"_"+datestr+".png";
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
          FileUtils.copyFile(scrFile, new File(filename));
          return filename;
	}

}
