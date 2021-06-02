package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import context.TestContext;
import helpers.HelperMethods;

public class Products extends BasePage {
	private TestContext context;
    private final HelperMethods helperMethods;
	 
	
	public Products(TestContext context) {
		this.context = context;
		 helperMethods = context.getPageObjectManager().getHelperMethods();
		
	}

	public WebElement productPageHeading(){ return findElementByXpath("//*[@class='prod_main_detail']"); }
	
	public WebElement Product(String product) { return findElementByXpath("//div[contains(text(),'" + product + "')]"); }

	public WebElement productInSideNavigation(String product){
		return findElementByXpath("//a[@class='sidebar-product-item'][contains(text(),'"+ product +"')]");
	}
	
	public WebElement AddToCartButton() {
		return findElementByXpath("//input[@name='AddToCartButton_12_30']");
	}

	public WebElement OrderNotes() { return findElementByXpath("//textarea[contains(@id,'OrderNotes')]");	}

	public List<WebElement> ProductVariants() { return findElementsByXpath("//div[@itemProp = 'offers']"); }
	
	public List<WebElement> AddToCartButtons() {
		return findElementsByXpath("//*[@value='Add to Cart']");
	}

	public WebElement categoryHeading(){
		return findElementByXpath("//h1[@class='catName']");
	}

	public WebElement breadCrumbText(){
		return findElementByXpath("//div[@class='breadcrumb_text']");
	}

	public WebElement subCategoryHeading(){ return findElementByXpath("//div[@id='Subcategory']"); }

	public WebElement catContent() { return findElementByXpath("//div[contains(@class,'category-content')]");	}

	//public WebElement catDetails(){ return findElementByXpath("//div[@class='content_left']"); }

	public WebElement sideNavigationTitle(){
		return findElementByXpath("//div[@class='sidebar-title']");
	}

	public WebElement sideproductMenu(){ return findElementByXpath("//div[@class='sidebar-list']"); }

	public WebElement productDescription(){ return findElementByXpath("//span[@id='LowerDescription']"); }

//	product details page

	public WebElement productTitle(String title){
		return findElementByXpath("//div[@class='prod_right_title']");
	}

	public WebElement productName(){
		return findElementByXpath("//span[contains(text(),'Product Name')]");
	}

	public WebElement activeIngredient(){
		return findElementByXpath("//span[contains(text(),'Active Ingredient')]");
	}

	public WebElement manufacturer(){
		return findElementByXpath("//span[contains(text(),'Manufacturer')]");
	}

	public WebElement productType(){
		return findElementByXpath("//span[contains(text(),'Product Type')]");
	}

	public WebElement productExpiryDate(){
		return findElementByXpath("//span[contains(text(),'Product expiry date we are currently shipping')]");
	}
}
