package com.Familiar.Lsac.org.Familiar.Lsac.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.text.View;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Random;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.awt.im.spi.InputMethod;
import java.io.File;
import java.lang.Object;

/**
 * Common methods for both Web and Android application
 * 
 * @author ShanthaLakhmi
 * 
 *         Written on 20/5/2020
 * 
 *
 */

public class CommonUtils extends driver {

	public CommonUtils(WebDriver chromedriver) {
		super();
	}

	public CommonUtils(AndroidDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}

	public void clickWhenReady(List<WebElement> pageTitle, int timeout) {

		WebElement element = null;

		WebDriverWait wait = new WebDriverWait(anddriver, timeout);

		// element = wait.until(ExpectedConditions.elementIfVisible(locator));

		element.click();

	}

	public static void click(long millSec) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(millSec);
		} catch (Exception e) {

		}
	}

	public static void sleep(long millSec) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(millSec);
		} catch (Exception e) {

		}

	}

	/*
	 * Random String generation
	 * 
	 */
	public String generateRandomString(int length) {
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();
		System.out.println(output);
		return output;
	}

	/*
	 * Random Email id generation
	 * 
	 */
	public String generateEmail(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz"; // alphabets

		String email = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		email = temp.substring(0, temp.length() - 4) + "@test.org";
		return email;
	}

	/*
	 * Random Alphanumeric characters generation
	 * 
	 */
	public String generateRandomAlphaNumeric(int length) {
		return RandomStringUtils.randomAlphanumeric(length);
	}

	/*
	 * Random Numbers generation
	 * 
	 */
	public String generateRandomNumber(int length) {
		return RandomStringUtils.randomNumeric(length);
	}

	/*
	 * selectOptionWithText
	 * 
	 */

	public Boolean isElementLoaded(WebElement maainScreen, int timeout) {
		WebDriverWait wait = new WebDriverWait(anddriver, timeout);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(maainScreen));
		return true;

	}

	public Boolean isElementPresent(List<WebElement> pageTitle) {
		WebDriverWait wait = new WebDriverWait(anddriver, 5);
		List<WebElement> element = wait.until(ExpectedConditions.visibilityOfAllElements(pageTitle));
		return true;

	}

	public void CheckSorting(List<WebElement> List) {
		ArrayList<String> obtainedList = new ArrayList<>();
		List<WebElement> elementList = List;
		for (WebElement we : elementList) {
			obtainedList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();
		for (String s : obtainedList) {
			sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));
	}

}
