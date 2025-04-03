package tests;

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
    void testLogoIsDisplayed() {
        homePage.open()
                .verifyLogoIsDisplayed();
    }

    @Test
    void testNavigationMenu() {
        homePage.open()
                .verifyNavigationMenu();
    }

    @Test
    void testNavigationToProductsPage() {
        homePage.open()
                .goToProducts();
        productsPage.verifyProductsListIsDisplayed();
    }

    @Test
    void testNavigationToCareerPage() {
        homePage.open()
                .goToCareer();
        careerPage.verifyVacanciesListIsDisplayed();
    }

    @Test
    void testNavigationToContactsPage() {
        homePage.open()
                .goToContacts();
        contactsPage.verifyContactInformationIsDisplayed();
    }

    @Test
    void testFooterLinks() {
        homePage.open()
                .verifyFooterLinks();
    }

    @Test
    void testMainNavButtonIsDisplayed() {
        homePage.open()
                .verifyNavButtonIsDisplayed();
    }

    @Test
    void testNewsSectionIsDisplayed() {
        homePage.open()
                .verifyGainsIsDisplayed();
    }

    @Test
    void testAboutPageNavigation() {
        homePage.open()
                .goToAbout();
        aboutPage.verifyAboutContentIsDisplayed();
    }
}