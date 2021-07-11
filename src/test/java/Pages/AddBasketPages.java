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
        buttonDetail.click();
        buttonAddBasket.click();
        buttonBasketCheckout.click();
    }

    @FindBy(linkText = "Add to wishlist")
    WebElement buttonAddWishlist;
    @FindBy(css = ".btn-add")
    WebElement buttonAdd;
    public void addWishlist(){
        buttonDetail.click();
        buttonAddWishlist.click();
        buttonAdd.click();
    }

    @FindBy(css = ".modal-body")
    WebElement nameWishlist;
    @FindBy(xpath = "//strong[.='Book was added to your wishlist']")
    WebElement messageSuccess;
    @FindBy(xpath = "//div[.='Selected book was added to your wishlist.']")
    WebElement messageSuccess2;
    public void validationWishlist(String wl){
        Assert.assertEquals("Item added to "+"My Wishlist",nameWishlist.getText().substring(0,25));
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
