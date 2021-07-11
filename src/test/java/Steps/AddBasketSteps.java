package Steps;

import Pages.AddBasketPages;

public class AddBasketSteps {
    AddBasketPages addBasketPages;

    public void addBasket(){
        addBasketPages.addBasket();
    }

    public void adjustAmount(String amount){
        addBasketPages.adjustAmount(amount);
    }

    public void validationAmount(String amount){
        addBasketPages.validationAmount(amount);
    }

    public void addWishlist(){
        addBasketPages.addWishlist();
    }

    public void validationWishlist(String wl){
        addBasketPages.validationWishlist(wl);
    }
}
