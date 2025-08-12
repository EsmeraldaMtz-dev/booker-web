package org.upskillher.web.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.upskillher.web.base.BaseTest;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.pages.HomePage;

public class NavbarTests extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(HomePageTests.class);


    @Test
    @Description("Verify Rooms Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void rommsLinkTest(){
        HomePage homePage = new HomePage(driver);
        navigateToHomePage();
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_ROOMS_LINK, HomePageMaps.ROOMS_SECTION, "rooms"));
    }

    @Test
    @Description("Verify Booking Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void bookingLinkTest(){
        HomePage homePage = new HomePage(driver);
        navigateToHomePage();
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_BOOKING_LINK, HomePageMaps.BOOKING_SECTION, "booking"));
    }

    /*@Test
    @Description("Verify Amenities Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void amenitiesLinkTest(){
        HomePage homePage = new HomePage(driver);
        navigateToHomePage();
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_AMENITIES_LINK, HomePageMaps.AMENITIES_SECTION, "amenities"));
    }*/

    @Test
    @Description("Verify Location Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void locationLinkTest(){
        HomePage homePage = new HomePage(driver);
        navigateToHomePage();
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_LOCATION_LINK, HomePageMaps.LOCATION_SECTION, "location"));
    }

    @Test
    @Description("Verify Contact Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void contactLinkTest(){
        HomePage homePage = new HomePage(driver);
        navigateToHomePage();
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_CONTACT_LINK, HomePageMaps.CONTACT_SECTION, "contact"));
    }
}
