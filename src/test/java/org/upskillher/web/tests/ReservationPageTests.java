package org.upskillher.web.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.upskillher.web.base.BaseTest;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.pages.HomePage;
import org.upskillher.web.pages.ReservationPage;

import java.util.List;

public class ReservationPageTests extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(ReservationPageTests.class);

    ReservationPage reservationPage;
    HomePage homePage;
    private SoftAssert softAssert;

    @BeforeMethod
    public void setUpHomePage(){
        reservationPage = new ReservationPage(driver);
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();
        navigateToHomePage();
    }
    
    @Test
    @Description("Verify Suite Room has all features are listed")
    @Severity(SeverityLevel.NORMAL)
    public void searchRooms(){
        List<String> roomsHrefs = homePage.checkRoomsAvailabilityWithDefaultDate();
        roomsHrefs.forEach(roomHref -> {
            driver.get(roomHref);
            List<String> roomFeatures =  reservationPage.getRoomFeaturesListed();
            softAssert.assertTrue(roomFeatures.contains("Radio"));
            softAssert.assertTrue(roomFeatures.contains("WiFi"));
            softAssert.assertTrue(roomFeatures.contains("Safe"));
        });
        softAssert.assertAll();
    }

}
