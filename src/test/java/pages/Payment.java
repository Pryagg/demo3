package pages;

import org.openqa.selenium.WebElement;

import context.TestContext;
import helpers.HelperMethods;

public class Payment extends BasePage{
	private TestContext context;
    private final HelperMethods helperMethods;
	
    public Payment(TestContext context) {	    
	    this.context = context;
		 helperMethods = context.getPageObjectManager().getHelperMethods();
		 
	}
    
    public WebElement ProceedToPurchaseButton() {
    	return findElementByXpath("//*[@value='Proceed to purchase']");
    }


    public WebElement shippingContinueButton() {
    	return findElementByXpath("//button[@id='ibShippingAddressNext']");
    }

    public WebElement shippingMethodHeading(){
        return findElementByXpath("//h2[contains(text(),'Shipping Method')]");
    }
    
    public WebElement changeShipping() {
    	return findElementByXpath("//input[@name='ctl00$PageContent$ibShippingAddressEdit']");
    }
    
    public WebElement shippingMethodContinueButton() {
    	return findElementByXpath("//button[@id='ibShippingMethodNext']");
    }
    
    public WebElement billingAddressContinueButton() {
    	return findElementByXpath("//button[@id='ibBillingAddressNext']");
    }

    public WebElement guestLoginContinueButton() {
        return findElementByXpath("//button[contains(@class,'ibNext_login')]");
    }
    
    public WebElement mailUsACheckPaymentMethod() {
    	return findElementByXpath("//input[contains(@id,'MethodSelectorPaperCheck')]");
    }
    
    public WebElement paymentContinueButton() {
    	return findElementById("billingNextButton");
    }

    public WebElement mailUsACheckContinueButton(){
        return findElementById("ibPaymentMethod_PaperCheck");
    }

    public WebElement paymentInTheProgressBar(){
        return findElementByXpath("//a[contains(text(),'3. Payment')]");
    }
  

}
