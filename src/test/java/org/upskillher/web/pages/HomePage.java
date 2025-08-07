package org.upskillher.web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.upskillher.web.base.BasePage;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.utils.Utils;

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


}
