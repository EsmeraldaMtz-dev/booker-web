package org.upskillher.web.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.upskillher.web.base.BaseTest;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.pages.HomePage;

public class HomePageTests extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(HomePageTests.class);

    HomePage homePage;

    @BeforeMethod
    public void setUpHomePage(){
        homePage = new HomePage(driver);
        navigateToHomePage();
    }

    @Test
    @Description("Verify Rooms Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void rommsLinkTest(){
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_ROOMS_LINK, HomePageMaps.ROOMS_SECTION, "rooms"));
    }

    @Test
    @Description("Verify Booking Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void bookingLinkTest(){
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_BOOKING_LINK, HomePageMaps.BOOKING_SECTION, "booking"));
    }

    /*@Test
    @Description("Verify Amenities Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void amenitiesLinkTest(){
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_AMENITIES_LINK, HomePageMaps.AMENITIES_SECTION, "amenities"));
    }*/

    @Test
    @Description("Verify Location Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void locationLinkTest(){
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_LOCATION_LINK, HomePageMaps.LOCATION_SECTION, "location"));
    }

    @Test
    @Description("Verify Contact Link navigates correctly")
    @Severity(SeverityLevel.NORMAL)
    public void contactLinkTest(){
        Assert.assertTrue(homePage.isSectionDisplayedWhenNavarLinkClicked(HomePageMaps.HEADER_CONTACT_LINK, HomePageMaps.CONTACT_SECTION, "contact"));
    }

    @Test
    public void searchRooms(){
        homePage.checkRoomsAvailavility(HomePageMaps.CHECK_AVAILABILITY_BTN);
        Assert.
    }
}
