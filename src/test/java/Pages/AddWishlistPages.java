package Pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddWishlistPages extends PageObject {
    @FindBy(linkText = "Ninth House")
    WebElement buttonDetail;
    public void goToDetail(){
        buttonDetail.click();
    }

    @FindBy(linkText = "Add to wishlist")
    WebElement buttonAddWishlist;
    @FindBy(css = ".btn-add")
    WebElement buttonAdd;
    public void addWishlist(){
        buttonAddWishlist.click();
        buttonAdd.click();
    }

    @FindBy(css = ".modal-body")
    WebElement nameWishlist;
    public void validationWishlist(String wl){
        Assert.assertEquals("Item added to "+"My Wishlist",nameWishlist.getText().substring(0,25));
    }
}
