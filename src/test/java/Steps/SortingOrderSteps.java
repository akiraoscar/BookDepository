package Steps;

import Pages.SortingOrderPages;

public class SortingOrderSteps {
    SortingOrderPages sortingOrderPages;

    public void searchBook(){
        sortingOrderPages.searchBook();
    }

    public void sortByOrder(String order){
        sortingOrderPages.sortByOrder(order);
    }

    public void validationSort(String order){
        sortingOrderPages.validationSort(order);
    }
}
