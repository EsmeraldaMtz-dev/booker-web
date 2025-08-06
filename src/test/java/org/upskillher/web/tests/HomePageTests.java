package org.upskillher.web.tests;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.upskillher.web.base.BasePage;
import org.upskillher.web.base.BaseTest;
import org.upskillher.web.maps.HomePageMaps;

public class HomePageTests extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(HomePageTests.class);

    public HomePageTests(WebDriver driver) {
        super(driver);
    }

    @Test
    public void clickHeaderRoomsLink(){
        safeClick(HomePageMaps.headerRoomsLink);
    }

}
