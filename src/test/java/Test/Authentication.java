package Test;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import Steps.AuthenticationSteps;

public class Authentication {
    @Steps
    private AuthenticationSteps authenticationSteps;

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        authenticationSteps.openPage();
    }

    @When("input with wrong password")
    public void input_with_wrong_password() {
        authenticationSteps.signIn("tahuular@gmail.com","tahuular11");
    }

    @Then("notification problem is displayed")
    public void notification_problem_is_displayed() {
        authenticationSteps.validationAlert("");
    }

    @When("input with right authentication")
    public void input_with_right_authentication() {
        authenticationSteps.signIn("tahuular@gmail.com","tahuular12");
    }

    @Then("sign in to the page")
    public void sign_in_to_the_page() {
        authenticationSteps.validateSignIn();
    }


}


