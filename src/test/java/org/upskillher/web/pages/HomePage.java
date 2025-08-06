package org.upskillher.web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.upskillher.web.base.BasePage;
import org.upskillher.web.maps.HomePageMaps;
import org.openqa.selenium.support.PageFactory;
import org.upskillher.web.utils.Utils;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    @Step
    public void headerRoomsLinkClick(){
        safeClick(HomePageMaps.HEADER_ROOMS_LINK);
    }

    @Step
    public boolean isRoomsSectionDisplayed(){
        WebElement roomsSection = driver.findElement(HomePageMaps.ROOMs_SECTION);
        String[] splitedUrl = Utils.safeSplit(driver.getCurrentUrl(), "#");
        return roomsSection.isDisplayed()
                && splitedUrl[1].equals("rooms");
    }

}
