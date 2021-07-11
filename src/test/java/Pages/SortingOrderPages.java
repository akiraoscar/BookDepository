package Pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortingOrderPages extends PageObject {
    @FindBy(css = "[placeholder='Search for books by keyword / title / author / ISBN']")
    WebElement boxSearch;
    @FindBy(css = ".header-search-btn")
    WebElement buttonSearch;
    public void searchBook(){
        boxSearch.sendKeys("Wisdom");
        buttonSearch.click();
    }

    @FindBy(css = ".search-filter-dropdown-option")
    WebElement dropDownSort;
    public void sortByOrder(String order){
        element(dropDownSort).selectByVisibleText(order);
    }

    public void validationSort(String order){
        Assert.assertTrue(dropDownSort.getText().contains(order));
    }


}
