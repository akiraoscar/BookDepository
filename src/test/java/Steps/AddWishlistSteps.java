package Steps;

import Pages.AddWishlistPages;

public class AddWishlistSteps {
    AddWishlistPages addWishlistPages;


    public void goToDetail(){
        addWishlistPages.goToDetail();
    }

    public void addWishlist(){
        addWishlistPages.addWishlist();
    }

    public void validationWishlist(String wl){
        addWishlistPages.validationWishlist(wl);
    }
}
