package Pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddBasketPages extends PageObject {
    @FindBy(linkText = "Ninth House")
    WebElement buttonDetail;
    @FindBy(linkText = "Add to basket")
    WebElement buttonAddBasket;
    @FindBy(xpath = "//a[.='Basket / Checkout']")
    WebElement buttonBasketCheckout;
    @FindBy(css = "[name='quantity']")
    WebElement selectQuantity;
    public void addBasket(){
        buttonAddBasket.click();
        buttonBasketCheckout.click();
    }

    public void adjustAmount(String amount){
        element(selectQuantity).selectByVisibleText(amount);
    }

    @FindBy(css = ".basket-msg")
    WebElement basketMsg;
    public void validationAmount(String amount){
        Assert.assertEquals("You have " +amount+ " items for a total of",basketMsg.getText().substring(0,31));
    }
}
