package com.UAT.RallyChoice.Automation.Pages;

import com.UAT.RallyChoice.Automation.Utilities.SeleniumHelper;
import com.UAT.RallyChoice.Automation.Utilities.TestNGHelper;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    private WebDriver checkoutPageDriver;
    private String currentScreenName;

    public CheckoutPage(WebDriver driver)
    {
        this.checkoutPageDriver=driver;

        currentScreenName=getClassName(this.getClass());
    }
    public WebElement Chk_Review()
    {
        WebElement element= SeleniumHelper.findElement_poc(checkoutPageDriver, readORProperties(currentScreenName, "Chk_Review"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "Chk_Review in CheckoutPage");
        return element;
    }
    public WebElement btn_CompleteEnrolLink()
    {
        WebElement element= SeleniumHelper.findElement_poc(checkoutPageDriver, readORProperties(currentScreenName, "btn_CompleteEnrolLink"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_CompleteEnrolLink in CheckoutPage");
        return element;
    }
    public WebElement btn_CheckoutNow()
    {
        WebElement element= SeleniumHelper.findElement_poc(checkoutPageDriver, readORProperties(currentScreenName, "btn_CheckoutNow"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "btn_CheckoutNow in CheckoutPage ");
        return element;
    }
    public WebElement label_LastPage()
    {
        WebElement element= SeleniumHelper.findElement_poc(checkoutPageDriver, readORProperties(currentScreenName, "label_LastPage"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_LastPage in CheckoutPage");
        return element;
    }
    public boolean label_LastPage1(){
        boolean element= SeleniumHelper.findElementpopup(checkoutPageDriver, readORProperties(currentScreenName, "label_LastPage"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.VISIBLE);
        return element ;
    }
    public WebElement label_completeEnrol()
    {
        WebElement element= SeleniumHelper.findElement_poc(checkoutPageDriver, readORProperties(currentScreenName, "label_completeEnrol"),Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "label_completeEnrol in CheckoutPage");
        return element;
    }
    public WebElement link_Exit() {
        WebElement element = SeleniumHelper.findElement_poc(checkoutPageDriver, readORProperties(currentScreenName, "link_Exit"), Constants.getShortSyc(),
                SeleniumHelper.ExplicitConditions.PRESENCE, "link_Exit in CheckoutPage");
        return element;
    }
    
    public List<WebElement> label_AgreeMsg()
    {
    		List<WebElement> elements= SeleniumHelper.findElements(checkoutPageDriver, readORProperties(currentScreenName, "label_AgreeMsg"),Constants.getLongSyc(),
    				SeleniumHelper.ExplicitConditions.PRESENCE);
    		System.out.println("======"+elements.size());
    		return elements;
    }
    
    
    public void clickCheckoutNow() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click clickCheckout on CheckoutPage ");
        SeleniumHelper.waitForPageLoad(checkoutPageDriver);
          SeleniumHelper.threadSleep(2000);

        SeleniumHelper.clickElement(btn_CheckoutNow());
    }
    public void clickCheckBox() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Check Box on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(checkoutPageDriver);
         SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(checkoutPageDriver, Chk_Review());
        SeleniumHelper.clickElement(Chk_Review());
    }
    public void clickCompleteEnrol() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": click Complete Enrollment on ReviewandAcceptPage ");
        SeleniumHelper.waitForPageLoad(checkoutPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.ScrollToElement(checkoutPageDriver, btn_CompleteEnrolLink());
        SeleniumHelper.clickElement(btn_CompleteEnrolLink());
    }

    public void CheckoutPageSaveVerifiction()
    {
        WaitForExistenceOfanElement(label_LastPage1());
        String strTxt =  SeleniumHelper.getElementText(label_LastPage());
        TestNGHelper.assertEqual(strTxt,"Last step! Please review and accept the terms below.","yes","CheckoutPageSaveVerifictionElm");
    }
    public void completeEnrolVerifiction()
    {
        SeleniumHelper.ScrollToElement(checkoutPageDriver,label_completeEnrol());
        String strTxt =  SeleniumHelper.getElementText(label_completeEnrol());
        TestNGHelper.assertEqual(strTxt,"Your benefit elections have been submitted","yes","completeEnrolVerifiction");
    }


    public void clickExit() {
        SeleniumHelper.logStepDetails("Step" + getStepNumber() + ": Click exit");
        SeleniumHelper.waitForPageLoad(checkoutPageDriver);
          SeleniumHelper.threadSleep(2000);
        SeleniumHelper.clickElement(link_Exit());
    }
    
   public void Label_AgreeMessageverification(){
	   SeleniumHelper.ScrollToElement(checkoutPageDriver, label_AgreeMsg().get(5));
	   SeleniumHelper.highlightElement(checkoutPageDriver, label_AgreeMsg().get(5));
	   String agreeMsg = SeleniumHelper.getElementText(label_AgreeMsg().get(5));
	   TestNGHelper.assertEqual(agreeMsg,"I understand that my benefits will not be effective unless first approved by my company’s benefits administrator or other relevant party.","no","completeEnrolVerifiction");
   }
    public void WaitForExistenceOfanElement(boolean ElementToInspect){
        //SeleniumHelper.threadSleep(2000);
        for(int i=0;i<=100;i++){
            boolean waitForEle= ElementToInspect;
            String waitForEle1 = String.valueOf(waitForEle);
            if(waitForEle1=="true"){
                SeleniumHelper.logStepDetails("Element found and performing next actions required " );
                SeleniumHelper.threadSleep(2000);
                break;
            }
        }
    }

}

