package Pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPages extends PageObject {
    @FindBy(xpath = "//div[@class='user-nav']//a[.='Sign in/Join']")
    WebElement buttonSignIn;
    @FindBy(xpath = "//input[@id='ap_email'][@tabindex='1']")
    WebElement textBoxEmail;
    @FindBy(xpath = "//iframe[@class='signin-iframe']")
    WebElement iframeSignIn;
    @FindBy(xpath = "//input[@placeholder='Book Depository password']")
    WebElement textBoxPassword;
    @FindBy(css = "#auth-signin-button")
    WebElement buttonSignInSubmit;
    public void signIn(String email, String password) {
        buttonSignIn.click();
        getDriver().switchTo().frame(iframeSignIn);
        textBoxEmail.sendKeys(email);
        textBoxPassword.sendKeys(password);
    }

    public void clickButtonSignInSubmit(){
        buttonSignInSubmit.click();
    }

    @FindBy(css = "#auth-error-message-box > .a-box-inner")
    WebElement alertContainer;
    @FindBy(css = "#auth-error-message-box .a-alert-heading")
    WebElement textAlert;
    public void validationAlert(String button) {
        alertContainer.isDisplayed();
        Assert.assertEquals("There was a problem",textAlert.getText());
    }
}
