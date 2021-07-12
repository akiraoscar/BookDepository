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
}
