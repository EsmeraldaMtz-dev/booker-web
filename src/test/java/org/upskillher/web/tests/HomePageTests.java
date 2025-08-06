package org.upskillher.web.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.upskillher.web.base.BaseTest;
import org.upskillher.web.pages.HomePage;

public class HomePageTests extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(HomePageTests.class);


    @Test
    public void headerLinksTest(){
        HomePage homePage = new HomePage(driver);
        navigateToHomePage();
        homePage.headerRoomsLinkClick();
        Assert.assertTrue(homePage.isRoomsSectionDisplayed());
    }

}
