package tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ProductsPage;
import pages.CareerPage;
import pages.ContactsPage;
import pages.AboutPage;

public class CenticoreTests extends TestBase {
    private final HomePage homePage = new HomePage();
    private final ProductsPage productsPage = new ProductsPage();
    private final CareerPage careerPage = new CareerPage();
    private final ContactsPage contactsPage = new ContactsPage();
    private final AboutPage aboutPage = new AboutPage();

    @Test
    @DisplayName("Verufy logo is displayed")
    void testLogoIsDisplayed() {
        homePage.open()
                .verifyLogoIsDisplayed();
    }

    @Test
    @DisplayName("Verify navigation menu is displayed")
    void testNavigationMenu() {
        homePage.open()
                .verifyNavigationMenu();
    }

    @Test
    @DisplayName("Verify navigation to Products page")
    void testNavigationToProductsPage() {
        homePage.open()
                .goToProducts();
        productsPage.verifyProductsListIsDisplayed();
    }

    @Test
    @DisplayName("Verify navigation to Career page")
    void testNavigationToCareerPage() {
        homePage.open()
                .goToCareer();
        careerPage.verifyVacanciesListIsDisplayed();
    }

    @Test
    @DisplayName("Verify navigation to Contacts page")
    void testNavigationToContactsPage() {
        homePage.open()
                .goToContacts();
        contactsPage.verifyContactInformationIsDisplayed();
    }

    @Test
    @DisplayName("Verify navigation to About page")
    void testFooterLinks() {
        homePage.open()
                .verifyFooterLinks();
    }

    @Test
    @DisplayName("Verify social media icons are displayed")
    void testMainNavButtonIsDisplayed() {
        homePage.open()
                .verifyNavButtonIsDisplayed();
    }

    @Test
    @DisplayName("Verify social media icons are displayed")
    void testNewsSectionIsDisplayed() {
        homePage.open()
                .verifyGainsIsDisplayed();
    }

    @Test
    @DisplayName("Verify navigation to About page")
    void testAboutPageNavigation() {
        homePage.open()
                .goToAbout();
        aboutPage.verifyAboutContentIsDisplayed();
    }
}