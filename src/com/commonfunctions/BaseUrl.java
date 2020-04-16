package com.commonfunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseUrl {
	
	 public static WebDriver driver;
	 static Properties properties = null;
	 
	 Logger logger = Logger.getLogger(BaseUrl.class);

	 public Properties loadpropertyfile() throws IOException {
		 
// Property file load then return the file			 
		 FileInputStream fileinputstream = new FileInputStream("config.properties");
		 properties =new Properties();
		 properties.load(fileinputstream); 
		 return properties;
	 } 
			@BeforeSuite
			public void launchbrowser() throws IOException 
			{
			PropertyConfigurator.configure("log4j.properties");
			logger.info("Open Judicial Test Begins");
			logger.info("Loading the Property file");
			
				loadpropertyfile();	
				String browser = properties.getProperty("browser");
				String UrL = properties.getProperty("Url");
				String driverlocation=properties.getProperty("driver");
				
				if(browser.equalsIgnoreCase("chrome")) {
					logger.info("Launching Chrome Browser");
					System.setProperty("webdriver.chrome.driver",driverlocation);
					driver = new ChromeDriver();
		
				}else if(browser.equalsIgnoreCase("firefox")) {
					logger.info("Launching Firefox Browser");
					System.setProperty("webdriver.gecko.driver",driverlocation);
					driver=new FirefoxDriver();
				}
				driver.manage().window().maximize();
				logger.info("Navigating to Application");
				driver.get(UrL);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			
//			@AfterSuite
//			public void closeApplication()
//			{
//				logger.info("Execution Done, Closing the browser");
//				driver.quit();
//			}


			public void OpenNewTab() throws AWTException {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
			
			public void OpenNewWindow() throws AWTException {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
			
			public void ActionNewPage() {			
			Set<String> winid = driver.getWindowHandles();
	        Iterator<String> iter = winid.iterator();
	        iter.next();
	        String tab = iter.next();
	        driver.switchTo().window(tab);	
			
			}
}
			
