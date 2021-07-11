package Test;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import Steps.AddBasketSteps;

public class AddBasket {
    @Steps
    AddBasketSteps addBasketSteps;

    @Given("User is already add to basket")
    public void user_is_already_add_to_basket() {
        addBasketSteps.addBasket();
    }

    @When("adjust amount ([^\"]*) in basket")
    public void adjust_amount_in_basket(String amount) {
        addBasketSteps.adjustAmount(amount);
    }

    @Then("amount ([^\"]*) is adjusted")
    public void amount_is_adjusted(String amount) {
        addBasketSteps.validationAmount(amount);
    }

    @Given("User is already on detail book page")
    public void user_is_already_on_detail_book_page() {

    }

    @When("add to wishlist")
    public void add_to_wishlist() {
        addBasketSteps.addWishlist();
    }

    @Then("item is added to ([^\"]*)")
    public void item_is_added_to_wishlist(String wl) {
        addBasketSteps.validationWishlist(wl);
    }

}
