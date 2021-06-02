package stepDefinitions;

import context.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.HelperMethods;
import helpers.Props;
import org.junit.Assert;
import pages.Account;
import pages.Cart;
import pages.HomePage;
import pages.Login;

public class CartSteps {

    TestContext context;
    HomePage homePage;
    Login login;
    HelperMethods helperMethods;
    Props props;
    Account account;
    Cart cart;

    public CartSteps(TestContext context) {
        this.context = context;
        homePage = context.getPageObjectManager().getHomePage();
        login = context.getPageObjectManager().getLogin();
        helperMethods = context.getPageObjectManager().getHelperMethods();
        props = context.getPageObjectManager().getProps();
        account = context.getPageObjectManager().getAccount();
        cart = context.getPageObjectManager().getCart();
    }

    @Then("^I verify the elements on the cart page$")
    public void verify_elements_on_cart_page() {
        Assert.assertTrue(cart.proceedToPurchaseTopButton().isDisplayed());
        Assert.assertTrue(cart.continueShoppingTopButton().isDisplayed());
        Assert.assertTrue(cart.updateCart().isDisplayed());
        Assert.assertTrue(cart.applyCoupon().isDisplayed());
        Assert.assertTrue(cart.proceedToPurchaseBottomButton().isDisplayed());
        Assert.assertTrue(cart.contineShoppingBottomButton().isDisplayed());
    }

    @And("^I click on Continue shopping button$")
    public void click_continue_shopping() {
        cart.continueShoppingTopButton().click();
    }

    @When("^I click on Remove from cart button$")
    public void click_remove_cart() {
        cart.removeFromCartButton().click();
    }

    @Then("^I verify that the product is added to cart$")
    public void verify_product_in_cart() {
        Assert.assertTrue(cart.productInCart().isDisplayed());
    }

    @Then("^I see that the product is removed from the cart$")
    public void verify_product_not_in_cart() {
        Assert.assertTrue(cart.emptyShoppingCart().isDisplayed());
    }

    @When("^I enter gift card value as (.+)$")
    public void enter_gift_card_value(String gcValue) {
        cart.giftCardTextInput().sendKeys(gcValue);
    }

    @When("^I click on Update cart button$")
    public void click_update_cart() {
        cart.updateCart().click();
    }

    @Then("^I see that the (.+) error is displayed$")
    public void gift_card_error(String error) {
        switch (error) {
            case "gift card":
                Assert.assertTrue(cart.giftCardError().isDisplayed());
                break;
            case "promotion code":
                Assert.assertTrue(cart.promotionCodeError().isDisplayed());
                break;
        }
    }

    @When("^I enter promotion code value as (.+)$")
    public void enter_promo_code(String code) {
        cart.promoCodeInput().sendKeys(code);
    }

    @When("^I click on apply (.+) button$")
    public void apply_discount(String discount) {
        switch (discount) {
            case "coupon":
                cart.applyCoupon().click();
                break;
            case "card":
                cart.applyCard().click();
                break;
           /* case "update cart":
                cart.updateCart().click();
                break;*/

        }
    }

    @Then("^I see that the (.+) is applied$")
    public void verify_discount_applied(String discount) {
        switch (discount) {
            case "coupon":

                break;
            case "card":
                cart.applyCard().click();
                break;
        }
    }


    @Then("^I see that the coupon code is expired$")
    public void verify_expired_coupon() {
        Assert.assertTrue(cart.expiredCouponError().isDisplayed());
    }


    @When("^I add notes in the cart$")
    public void add_notes_in_cart() {
        cart.notes().sendKeys("");

    }
}


