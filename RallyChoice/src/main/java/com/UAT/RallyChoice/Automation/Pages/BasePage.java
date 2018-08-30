package com.UAT.RallyChoice.Automation.Pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.UAT.RallyChoice.Automation.Utilities.AutomationCore;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;
import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper.ExplicitConditions;

public class BasePage extends AutomationCore {
	private static int firstCharClassIndex;
	private static String currentbBaseScreenName;
	public LoginPage rallyChoiceLoginPage = null;
	
	

	
	// to be deleted of PCOPS

	public static String strAttachment = "";
	public static String getnextstatus;

	public static boolean logInState = false;
	public static String testNameValue = "";
	public static int assignCount = 1;
	public static String Tin = "";
	public static int stepNum = 0;
	public WebDriver driver = null;
	public static String appType = "";

	public String getClassName(@SuppressWarnings("rawtypes") Class c) {
		firstCharClassIndex = c.getName().lastIndexOf(".") + 1;
		if (firstCharClassIndex > 0) {
			currentbBaseScreenName = c.getName().substring(firstCharClassIndex).toString();
			return currentbBaseScreenName;
		}

		return null;
	}

	

	/*
	 * public long getCurrentBrowserSyncTime() { if(currentBrowser.equals("ff"))
	 * { return
	 * Long.parseLong(Environment("ffDefaultTestPageLoadSyncTimePeriod")); }
	 * else if(currentBrowser.equals("ie")) { return
	 * Long.parseLong(Environment("ieDefaultTestPageLoadSyncTimePeriod")); }
	 * return 0; }
	 */

	// SAM Application
	// Getting login page instance
	public void getLoginPage(WebDriver pageDriver) {
		rallyChoiceLoginPage = new LoginPage(pageDriver);
	}


	/* RDE_Pages Instances started */


	/* RDE_Pages Instances Completed */

	// to be deleted of PCOPS
	// Getting home page instance

	// Switch to default content
	public static void switchToDefault(WebDriver pageDriver) {

		SeleniumHelper.switchDefaultContent(pageDriver);

		// if(SeleniumHelper.switchDefaultContent(pageDriver))
		// {
		// return true;
		// }

		/*
		 * if(!switchDefaultContent) {
		 * if(SeleniumHelper.switchDefaultContent(pageDriver)) {
		 * updateFrameStatus(false,
		 * true,false,false,false,false,false,false,false); return true; } }
		 * else { return true; }
		 */
		// return false;

	}

	// SeleniumHelper.setExplicitWaitForFrameAndSwitch(createPhyconIntakeDriver,
	// 20, "xpath", "//iframe[@title='My Cases']");
	public boolean switchAvailableFrameContains(WebDriver pageDriver, String attrName, String frameTitle) {
		try {

			SeleniumHelper.threadSleep(500);
			List<WebElement> frames = SeleniumHelper.findElements(pageDriver, new String[] { "TAGNAME", "iframe" },
					Constants.getLongSyc(), ExplicitConditions.PRESENCE);
			// System.out.println(frames.size());
			for (WebElement frame : frames) {
				if (frame.getAttribute(attrName).contains("Assignment")) {
					if (assignCount == 3) {
						TestNGHelper.fail("Frame title is Assignment but not GD case");
					}
					assignCount++;
					switchAvailableFrameContains(pageDriver, attrName, frameTitle);
				}

				if (frame.getAttribute(attrName).contains(frameTitle)) {
					if (SeleniumHelper.setExplicitWaitForFrameAndSwitch(pageDriver, 20, Constants.elemantLocator_id,
							frame.getAttribute("id"))) {
						return true;
					} else {
						TestNGHelper.fail("Found frame with title " + frameTitle
								+ " but failed to switch to it using id attribute " + frame.getAttribute("id"));
					}
				}
			}
		} catch (Exception e) {

		}
		return false;
	}

	public String formatDatePerReportPage(String date) {
		String[] s = date.split(" ");
		if (s[2].substring(0, 1).equals("0")) {
			return s[1] + " " + (s[2].replace("0", "")) + ", " + s[(s.length - 1)];
		}
		return s[1] + " " + s[2] + ", " + s[(s.length - 1)];
	}

	public String formatLongStringForReport(String strValue) {
		String subStr = null;
		// String newStr=null;
		int strLen = strValue.length();
		for (int ind = 0; ind <= strLen - 1; ind = ind + 3) {
			if (subStr == null) {
				subStr = strValue.substring(ind, ind + 3);
			} else {
				subStr = subStr + "," + strValue.substring(ind, ind + 3);
			}

		}
		return subStr;
	}

	public String formatLongStringForReportPage(String strValue) {
		String subStr = strValue.charAt(0) + "," + strValue.substring(1, 4) + "," + strValue.substring(4, 7);
		return subStr;
	}

	public void getAttachMentFile() {
		try {
			File attachMent = createFile("txt", Environment("attachMentsPath"));
			writeAndSaveTextFile(attachMent, generateRandomString(5, "AB"));
			strAttachment = getAbolutePathofFile(attachMent);
		} catch (Exception e) {
			e.getMessage();
			strAttachment = "";
		}

	}

	

	public WebElement getSubMenuFromSubmitterNavigation(WebDriver driver, WebElement mainMenu, String menuName) {

		try {
			SeleniumHelper.threadSleep(3000);

			// SeleniumHelper.setRunTimeImplicitWait(driver, 0);
			// SeleniumHelper.setExplicitWaitForElementToBeClickable(driver,10,"classname",
			// "menuBarSub");
			WebElement menuBox = SeleniumHelper.findElement(driver,
					new String[] { SeleniumHelper.ElementLocator.CLASSNAME.toString(), "menuBarSub" },
					Constants.getLongSyc(), ExplicitConditions.CLICK);
			if (menuBox == null) {
				SeleniumHelper.clickElement(mainMenu);
			}
			if (menuBox == null) {

			}
			List<WebElement> menus = menuBox.findElements(By.tagName("td"));
			for (WebElement menu : menus) {
				if (menu.getText().equalsIgnoreCase(menuName))
					return menu;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	

	public static int getStepNumber() {
		stepNum = stepNum + 1;
		return stepNum;
	}

	public void Mpp_LogOut() {
		driver = SeleniumHelper.getDriver();
		SeleniumHelper.setExplicitWaitForFrameAndSwitch(driver, 10, "id", "link-topnav");

		WebElement mainMenu = driver.findElement(By.xpath("//a[@ng-show='showMenu']"));
		SeleniumHelper.clickElement(mainMenu);

		switchToDefault(driver);
		SeleniumHelper.setExplicitWaitForFrameAndSwitch(driver, 10, "id", "link-leftnav");

		WebElement mppSignOut = SeleniumHelper.findElement_poc(driver,
				new String[] { "Xpath", "//li[@class='Leftnav__link Leftnav__link--signout']" }, Constants.getLongSyc(),
				ExplicitConditions.CLICK, "Mpp Logout button");
		mppSignOut.click();
		switchToDefault(driver);
	}

	public boolean subMitterMenuNavigation_SwitchApps(WebDriver driver, String mainMenuName, String subMenuName,
			String appName) {
		WebElement subMenu = null;
		WebElement mainMenu = null;
		long syncCount = 0;
		try {
			WebElement menuName = SeleniumHelper.findElement(driver, new String[] { "linkText", mainMenuName.trim() },
					Constants.getShortSyc(), ExplicitConditions.CLICK);

			mainMenu = SeleniumHelper.findElementByTagName(menuName, "img");
			if (!SeleniumHelper.clickElement(mainMenu)) {
				return false;
			}
			subMenu = getSubMenuFromSubmitterNavigation(driver, mainMenu, subMenuName.trim());
			while (subMenu == null) {
				SeleniumHelper.clickElement(mainMenu);
				subMenu = getSubMenuFromSubmitterNavigation(driver, mainMenu, subMenuName.trim());
				syncCount++;
				if (syncCount == 1000) {
					break;
				}
			}

			SeleniumHelper.mouseHover(driver, subMenu);

			WebElement element = SeleniumHelper.findElement_poc(driver,
					new String[] { "Xpath", "//*[@id='ItemMiddle' and contains(.,'" + appName + "')]" },
					Constants.getLongSyc(), ExplicitConditions.CLICK, appName + " app");

			SeleniumHelper.clickElement(element);

			return true;

		} catch (Exception e) {
			e.getMessage();
			return false;
		}
	}

}
