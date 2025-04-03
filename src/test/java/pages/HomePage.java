package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private final SelenideElement logo = $("header .logo");
    private final SelenideElement productsLink = $("a[href='/products/']");
    private final SelenideElement careerLink = $("a[href='/career/']");
    private final SelenideElement contactsLink = $("a[href='/contacts/']");
    private final SelenideElement aboutLink = $("a[href='/about/']");

    private final SelenideElement navButton = $(".nav-open");
    private final SelenideElement gains = $(".gains");

    private final ElementsCollection footerLinks = $$("footer a");
    private final ElementsCollection socialMediaIcons = $$("footer .social-icons a");

    public HomePage open() {
        Selenide.open("/");
        return this;
    }

    public HomePage verifyLogoIsDisplayed() {
        logo.shouldBe(visible);
        return this;
    }

    public HomePage verifyNavigationMenu() {
        productsLink.shouldBe(visible);
        careerLink.shouldBe(visible);
        contactsLink.shouldBe(visible);
        aboutLink.shouldBe(visible);
        return this;
    }

    public HomePage goToProducts() {
        productsLink.click();
        return this;
    }

    public HomePage goToCareer() {
        careerLink.click();
        return this;
    }

    public HomePage goToContacts() {
        contactsLink.click();
        return this;
    }

    public HomePage goToAbout() {
        aboutLink.click();
        return this;
    }

    public HomePage verifyNavButtonIsDisplayed() {
        navButton.shouldBe(visible);
        return this;
    }

    public HomePage verifyGainsIsDisplayed() {
        gains.shouldBe(visible);
        return this;
    }

    public HomePage verifyFooterLinks() {
        footerLinks.shouldBe(sizeGreaterThan(0));
        return this;
    }

    public HomePage verifySocialMediaIcons() {
        socialMediaIcons.shouldBe(sizeGreaterThan(0));
        return this;
    }
}