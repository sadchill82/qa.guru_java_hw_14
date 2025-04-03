package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ContactsPage {
    private final SelenideElement contactInfo = $(".services__list");

    public ContactsPage verifyContactInformationIsDisplayed() {
        contactInfo.shouldBe(visible);
        return this;
    }
}