/** Webdriver and Android driver for invoking common
 * methods 
 * 
 */

package com.Familiar.Lsac.org.Familiar.Lsac.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class driver {

	public AndroidDriver anddriver;
	public WebDriver chromedriver;

	public void driver(AndroidDriver driver) {

		this.anddriver = anddriver;
		loadElements();
	}

	public void driver(WebDriver driver) {

		this.chromedriver = chromedriver;
		loadElements();
	}

	public void loadElements() {

		PageFactory.initElements(anddriver, this);
	}

	public void loadElementsweb() {

		PageFactory.initElements(chromedriver, this);
	}

}
