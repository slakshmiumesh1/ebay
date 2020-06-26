/** Test case for the loginpage
 * @author Shantha Lakshmi on 20/5/2020
 * 
 */
package com.Familiar.Lasc.org.tests;

import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Familiar.Lsac.org.Familiar.Lsac.org.AppUtilWithDesktopScript;
import com.Familiar.Lsac.org.pages.*;
import com.mysql.jdbc.log.Log;

class LoginTest extends AppUtilWithDesktopScript {

	AppUtilWithDesktopScript AppUtilWithDesktopScriptobj;
	LoginPage LoginpageObj;

	/**
	 * For invoking the Selenium web application on desktop
	 */

	@Test(priority = 1, alwaysRun = true, enabled = true)
	public void VerifyloginDesktop() {

		try {

			AppUtilWithDesktopScriptobj = new AppUtilWithDesktopScript();
			AppUtilWithDesktopScriptobj.AppUtil();
		} catch (Exception e) {

			e.getMessage();
		}

		try {

			AppUtilWithDesktopScriptobj = new AppUtilWithDesktopScript();
			AppUtilWithDesktopScriptobj.setUpWEB();
		} catch (Exception e) {
			e.printStackTrace();

		}

		// Verify About LSAC

		LoginpageObj = new LoginPage(webdriver);
		LoginpageObj.clikOnAboutLSAC();

		// Verify Events

		LoginpageObj = new LoginPage(webdriver);
		LoginpageObj.clikOnEvents();

		// Verify Blog

		LoginpageObj = new LoginPage(webdriver);
		LoginpageObj.clikOnBlog();

		// Verify contactus

		LoginpageObj = new LoginPage(webdriver);
		LoginpageObj.clikOnContactUS();

	}

	/**
	 * For invoking the Appium application on Android device
	 */

	@Test(priority = 2, alwaysRun = true, enabled = true)
	public void VerifyloginMobile() {
		try {

			AppUtilWithDesktopScriptobj = new AppUtilWithDesktopScript();
			AppUtilWithDesktopScriptobj.AppUtil();
		} catch (Exception e) {
			e.getMessage();
		}

		try {

			AppUtilWithDesktopScriptobj = new AppUtilWithDesktopScript();
			AppUtilWithDesktopScriptobj.setUpAndroid();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Verify About LSAC

		LoginpageObj = new LoginPage(driver);
		LoginpageObj.ANDclikOnAboutLSAC();

		// Verify blog

		LoginpageObj = new LoginPage(driver);
		LoginpageObj.ANDclikOnBlog();

		// Verify Contactus

		LoginpageObj = new LoginPage(driver);
		LoginpageObj.ANDclikOnContactUS();

		// Verify Events

		LoginpageObj = new LoginPage(driver);
		LoginpageObj.ANDclikOnEvents();

	}

}
