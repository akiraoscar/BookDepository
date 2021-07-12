package Test;

import Steps.AddWishlistSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddWishlist {
    @Steps
    AddWishlistSteps addWishlistSteps;

    @Given("User is already on detail book page")
    public void user_is_already_on_detail_book_page() {
        addWishlistSteps.goToDetail();
    }

    @When("add to wishlist")
    public void add_to_wishlist() {
        addWishlistSteps.addWishlist();
    }

    @Then("item is added to wishlist")
    public void item_is_added_to_wishlist() {
        addWishlistSteps.validationWishlist();
    }

    @When("delete wishlist")
    public void delete_wishlist() {
        addWishlistSteps.deleteWishlist();
    }

}
