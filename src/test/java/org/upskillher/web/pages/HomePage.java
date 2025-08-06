package org.upskillher.web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.upskillher.web.base.BasePage;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.utils.Utils;

public class HomePage extends BasePage {
    private HomePageMaps maps;
    public HomePage(WebDriver driver){
        super(driver);
        maps = new HomePageMaps();
    }

    @Step
    public void headerRoomsLinkClick(){
        safeClick(maps.headerRoomsLink);
    }

    @Step
    public boolean isRoomsSectionDisplayed(){
        String[] splitedUrl = Utils.safeSplit(driver.getCurrentUrl(), "#");
        return maps.roomsSection.isDisplayed()
                && splitedUrl[1].equals("rooms");
    }

}
