package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AboutPage {
    private final SelenideElement aboutContent = $(".about");

    public AboutPage verifyAboutContentIsDisplayed() {
        aboutContent.shouldBe(visible);
        return this;
    }
}