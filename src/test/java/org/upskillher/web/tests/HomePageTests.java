package org.upskillher.web.tests;


import io.qameta.allure.*;
import io.qameta.allure.SeverityLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.upskillher.web.base.BaseTest;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.pages.HomePage;

public class HomePageTests extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(HomePageTests.class);

    HomePage homePage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void setUpHomePage(){
        homePage = new HomePage(driver);
        navigateToHomePage();
    }

    @Test(description = "Verificar Rooms Link en el navar funciona correctamente")
    @Epic("Home Page Tests")
    @Feature("Navbar Links")
    @Story("Rooms Link Nabvar displays correctly")
    @Severity(SeverityLevel.NORMAL)
    public void rommsLinkTest(){
        softAssert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_ROOMS_LINK, HomePageMaps.ROOMS_SECTION, "rooms"));
    }

    @Test(description = "Verificar Booking Link en el navbar funciona correctamente")
    @Epic("Home Page Tests")
    @Feature("Navbar Links")
    @Story("Booking Link Nabvar displays correctly")
    @Severity(SeverityLevel.NORMAL)
    public void bookingLinkTest(){
        softAssert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_BOOKING_LINK, HomePageMaps.BOOKING_SECTION, "booking"));
    }


    @Test(description = "Verificar Amenities Link en el navar funciona correctamente")
    @Epic("Home Page Tests")
    @Feature("Navbar Links")
    @Story("Amenities Link Nabvar displays correctly")
    @Severity(SeverityLevel.NORMAL)
    public void amenitiesLinkTest() {
        softAssert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_AMENITIES_LINK, HomePageMaps.AMENITIES_SECTION, "amenities"));
    }

    @Test(description = "Verificar Location Link en el navar funciona correctamente")
    @Epic("Home Page Tests")
    @Feature("Navbar Links")
    @Story("Location Link Nabvar displays correctly")
    @Severity(SeverityLevel.NORMAL)
    public void locationLinkTest(){
        softAssert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_LOCATION_LINK, HomePageMaps.LOCATION_SECTION, "location"));
    }

    @Test(description = "Verificar Contact Link en el navar funciona correctamente")
    @Epic("Home Page Tests")
    @Feature("Navbar Links")
    @Story("Contact Link Nabvar displays correctly")
    @Severity(SeverityLevel.NORMAL)
    public void contactLinkTest(){
        softAssert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_CONTACT_LINK, HomePageMaps.CONTACT_SECTION, "contact"));
    }

    @Test(description = "Verificar Rooms Availability")
    @Epic("Home Page Tests")
    @Feature("Rooms Availability")
    @Story("Check Rooms Availability With Default Date")
    @Severity(SeverityLevel.NORMAL)
    public void searchRooms(){
        Assert.assertFalse(homePage.getRoomsWithDefaultAvailabilityDate().isEmpty());
    }
}
