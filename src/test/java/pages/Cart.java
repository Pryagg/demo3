package pages;

import context.TestContext;
import helpers.HelperMethods;
import org.openqa.selenium.WebElement;

public class Cart extends BasePage {

    TestContext context;
    HelperMethods helperMethods;


    public Cart(TestContext context) {
        this.context = context;
        helperMethods = context.getPageObjectManager().getHelperMethods();
    }

    public WebElement continueShoppingTopButton(){
        return findElementByXpath("//input[@value='Continue shopping'][@name = 'ctl00$PageContent$btnContinueShoppingTop']");
      //  return findElementByXpath("//input[@value='Continue shopping'][@name = 'ctl00$PageContent$btnContinueShoppingTop']");
    }

    public WebElement proceedToPurchaseTopButton(){
       return findElementByXpath("//input[@value='Proceed to purchase'][@name = 'ctl00$PageContent$btnCheckOutNowTop']");
    }
    public WebElement applyCard(){
       // return findElementByXpath("//input[@value='Apply card']");
       return findElementByXpath("//input[@value='Update Cart']");

    }

    public WebElement applyCoupon(){
       return findElementByXpath("//input[@value='Apply coupon']");
    }

    public WebElement updateCart(){
       return findElementByXpath("//input[@value='Update Cart']");
    }

    public WebElement contineShoppingBottomButton(){
       return findElementByXpath("//input[@value='Continue shopping'][@name = 'ctl00$PageContent$btnContinueShoppingBottom']");
    }

    public WebElement proceedToPurchaseBottomButton(){
       return findElementByXpath("//input[@value='Proceed to purchase'][@name = 'ctl00$PageContent$btnCheckOutNowBottom']");
    }

    public WebElement removeFromCartButton(){
        return findElementByXpath("//*[@class='CartDeleteButton']");
    }

    public WebElement productInCart(){
        return findElementByXpath("//div[@class='cart_item_name']");
    }

    public WebElement emptyShoppingCart(){
        return findElementByXpath("//*[@class='topic_text']");
    }

    public WebElement giftCardTextInput(){
        return findElementByCssSelector("#ctl00_PageContent_CouponCode");
    }

    public WebElement giftCardError(){
        return findElementByXpath("//span[contains(text(),'Gift card not found')]");
    }

    public WebElement promotionCodeError(){
        return findElementByXpath("//span[contains(text(),'Promotion code not found.')]");
    }

    public WebElement promoCodeInput(){
        return findElementByXpath("//span[@class='promotioncodeentrybox']");
    }

    public WebElement expiredCouponError(){
        return findElementByXpath("//span[contains(text(),'This promotion has expired.')]");
    }

    public WebElement notes(){
        return findElementByXpath("");
    }




}
