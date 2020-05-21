/**  The page created for the login page
 * 
 * All the webelements and the methods are defined here
 * 
 * @author ShanthaLakhmi
 */

package com.Familiar.Lsac.org.pages;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	public AndroidDriver anddriver;
	public WebDriver webdriver;
	public static com.Familiar.Lsac.org.Familiar.Lsac.org.CommonUtils Commonmethods;
	@FindBy(xpath = "//button[contains(text(), About LSAC)]")
	public WebElement AboutLSAC;
	@FindBy(xpath = "//button[contains(text(), Events)]")
	public WebElement Events;
	@FindBy(xpath = "//button[contains(text(), Blog)]")
	public WebElement Blog;
	@FindBy(xpath = "//button[contains(text(), ContactUS)]")
	public WebElement ContactUS;
	@AndroidFindBy(xpath = "//button[contains(text(), About LSAC)]")
	public WebElement AboutLSAC1;
	@AndroidFindBy(xpath = "//button[contains(text(), Events)]")
	public WebElement Events1;
	@AndroidFindBy(xpath = "//button[contains(text(), Blog)]")
	public WebElement Blog1;
	@AndroidFindBy(xpath = "//button[contains(text(), ContactUS)]")
	public WebElement ContactUS1;

	public LoginPage(WebDriver webdriver) {
		this.webdriver = webdriver;
		PageFactory.initElements(webdriver, this);

	}

	public LoginPage(AndroidDriver anddriver) {
		this.anddriver = anddriver;
		PageFactory.initElements(anddriver, this);

	}

	public void clikOnAboutLSAC() {
		AboutLSAC.click();

	}

	public void clikOnEvents() {
		Events.click();

	}

	public void clikOnBlog() {
		Blog.click();

	}

	public void clikOnContactUS() {
		ContactUS.click();

	}

	public void ANDclikOnAboutLSAC() {
		AboutLSAC.click();

	}

	public void ANDclikOnEvents() {
		Events.click();

	}

	public void ANDclikOnBlog() {
		Blog.click();

	}

	public void ANDclikOnContactUS() {
		ContactUS.click();

	}
}
