package Test;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import Steps.SortingOrderSteps;


public class SortingOrder {
    @Steps
    SortingOrderSteps sortingOrderSteps;

    @Given("User is already search a book")
    public void user_is_already_search_a_book() {
        sortingOrderSteps.searchBook();
    }

    @When("sort by ([^\"]*)")
    public void sort_by(String order) {
        sortingOrderSteps.sortByOrder(order);
    }

    @Then("result is sorted by ([^\"]*)")
    public void result_is_sorted_by(String order) {
        sortingOrderSteps.validationSort(order);
    }

}
