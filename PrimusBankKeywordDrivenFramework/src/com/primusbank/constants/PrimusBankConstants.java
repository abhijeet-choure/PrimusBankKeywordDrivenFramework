package com.primusbank.constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PrimusBankConstants 
{
 public static WebDriver driver=new FirefoxDriver();
 public static String url="http://primusbank.qedgetech.com";	
 
 @BeforeSuite
 public static void launchApp()
 {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get(url);
 }
 
 @AfterSuite
 public static void closeApp()
 {
	 driver.close();
 }
 
 
	
}
