package org.upskillher.web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.upskillher.web.base.BasePage;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.utils.Utils;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    /*----- NAVBAR Test Steps ----------------------------------------------------------------------------------------*/
    @Step
    public boolean isSectionDisplayedWhenNavarLinkClicked(By linkLocator, By sectionLocator, String sectionName){
        safeClick(linkLocator);
        WebElement roomsSection = driver.findElement(sectionLocator);
        String[] splitedUrl = Utils.safeSplit(driver.getCurrentUrl(), "#");
        return roomsSection.isDisplayed()
                && splitedUrl[1].equals(sectionName);
    }

    @Step
    public String getDateInputData(By dateInput){
        return getSafeText(dateInput);
    }

    @Step
    public void clickcheckAvailabilityBtn(By checkAvailabilityBtn){
        safeClick(checkAvailabilityBtn);
    }



    @Step
    public List<String> checkRoomsAvailabilityWithDefaultDate(){
        return driver.findElements(HomePageMaps.ROOM_BOOK_NOW_BTNS)
                .stream()
                .map(webElement -> webElement.getAttribute("href"))
                .collect(Collectors.toList());
    }
}
