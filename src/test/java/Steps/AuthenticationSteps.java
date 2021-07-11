package Steps;

import Pages.AuthenticationPages;
import net.thucydides.core.steps.ScenarioSteps;

public class AuthenticationSteps extends ScenarioSteps {
    private AuthenticationPages authencticationPages;

    public void openPage(){
        authencticationPages.open();
    }

    public void signIn(String email, String password) {
        authencticationPages.signIn(email, password);
    }

    public void clickButtonSignInSubmit(){
        authencticationPages.clickButtonSignInSubmit();
    }

    public void validationAlert(String button) {
        authencticationPages.validationAlert(button);
    }
}
