package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ProductsPage {
    private final ElementsCollection productsList = $$(".products__item");

    public ProductsPage verifyProductsListIsDisplayed() {
        productsList.shouldBe(sizeGreaterThan(0));
        return this;
    }
}