package pages;

import org.openqa.selenium.WebElement;

import context.TestContext;
import helpers.HelperMethods;

public class OrderConfirmation extends BasePage {
	private TestContext context;
    private final HelperMethods helperMethods;

	public OrderConfirmation(TestContext context) {
		this.context = context;
		 helperMethods = context.getPageObjectManager().getHelperMethods();
	}

	public WebElement KeepintouchContinueButton() {
		//return findElementByXpath("//button[@id=\"ibContinueSubscription\"]");
		return findElementById("ibContinueSubscription");
	}

	public WebElement personalUseTerm() {
		return findElementByXpath("//span[contains(text(),'I confirm the medications on this order are for my')]");
	}
	
	public WebElement patientNameLabel() {
		return findElementByXpath("//div[@class='checkout-panel-form']//h3[contains(text(),\"Patient's Name\")]");
	}
	
	public WebElement patientNameTextInput() {
		return findElementById("patientName");
	}
	
	public WebElement prescribedMedicinesTerm() {
		return findElementByXpath("//span[contains(text(),'The medications I am purchasing are in accordance')]");
	}
	
	public WebElement doctorDetailsLabel() {
		return findElementByXpath("//div[@class='checkout-panel-form']//h3[contains(text(),\"Doctor's Details\")]");
	}
	
	public WebElement doctorNameLabel() {
		return findElementByXpath("//span[contains(text(),\"Doctor's Name:\")]");
	}
	
	public WebElement doctortNameTextInput() {
		return findElementById("doctorName");
	}
	
	public WebElement covidTerm() {
		return findElementByXpath("//span[contains(text(),'COVID-19 Delays: I understand there are delays wit')]");
	}

	public WebElement over18Term() {
		return findElementByXpath("//span[(@class='terms_text')][contains(text(),'I confirm that I am over 18')]");
	}
	public WebElement clickDOB() {
		return findElementById("ctl00_lblDOB");
	}

	public WebElement selectYearofDOB() {
		return findElementByXpath("//select[contains(@name,'DOBYear')]");
	}

	public WebElement selectMonthofDOB() {
		return findElementByXpath("//select[contains(@name,'DOBMonth')]");
	}

	public WebElement selectDateofDOB() {
		return findElementByXpath("//select[contains(@name,'DOBDay')]");
	}


	public WebElement termsContinueButton() {
		return findElementByXpath("//button[@id='ibContinueTerms']");
		
	}
	public WebElement createAccountGuestUserYes() {
		return findElementByXpath("//input[(@id='rbCreateAccount')]");

	}

	public WebElement createAccountGuestUserNo () {
		return findElementByXpath("//input[(@id='rbGuestAccount')]");

	}

	public WebElement completeOrderButton() {
		return findElementByXpath("//button[(@class='checkout-place-order')][contains(@id,'ibPlaceOrder')]");
		
	}

	public WebElement orderConfirmationHeading() {
		return findElementByXpath("//div[contains(text(),'ORDER RECEIVED')]");
	}

}
