package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CareerPage {
    private final ElementsCollection vacanciesList = $$(".vacancies__item");

    public CareerPage verifyVacanciesListIsDisplayed() {
        vacanciesList.shouldBe(sizeGreaterThan(0));
        return this;
    }
}