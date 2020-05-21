package com.Familiar.Lsac.org.Familiar.Lsac.org;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtilWithDesktopScript {
	private static Process process;
	public WebDriver webdriver;
	public String driverPath;
	public static AndroidDriver driver;
	public static Properties config;
	public static Logger log = Logger.getLogger("deployingLogger");

	public void AppUtil() {

		try {

			config = new Properties();
			FileInputStream fs;

			fs = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\Familiar\\Lsac\\org\\Familiar\\Lsac\\org\\Config.properties");
			config.load(fs);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Setup for web application of chrome on desktop
	 * 
	 * @throws Exception
	 */

	public void setUpWEB() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver();
		driver.get("http://lsac.org/lsat-prep-get-familiar");
		driver.manage().window().maximize();

	}

	/**
	 * Desired capabalities for invoking chrome on Android device
	 * 
	 * @throws Exception
	 */
	public static void setUpAndroid() throws Exception {
		if (config.getProperty("appTest").equals("Device")) {
			String workingDir = System.getProperty("user.dir");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("automationName", config.getProperty("automationName"));
			capabilities.setCapability("device", config.getProperty("device"));
			capabilities.setCapability("deviceName", config.getProperty("deviceName"));
			capabilities.setCapability("platformVersion", config.getProperty("platformVersion"));
			capabilities.setCapability("platformName", config.getProperty("platformName"));
			capabilities.setCapability("BROWSER_NAME", config.getProperty("brwsername"));
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			AppiumDriver driver = new AppiumDriver(url, capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			driver.get("http://lsac.org/lsat-prep-get-familiar");
			capabilities.setCapability("SESSION_OVERRIDE", true);
		}
	}

	// @AfterMethod
	public void teardown() throws IOException, InterruptedException {
		driver.quit();
	}
}
