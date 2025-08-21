package org.upskillher.web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.upskillher.web.base.BasePage;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.maps.ReservationPageMaps;

import java.util.List;
import java.util.stream.Collectors;

public class ReservationPage extends BasePage {

    public ReservationPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public void accessReservationByBookNowBtn(WebElement bookNowBtn){
        safeClick(bookNowBtn);
    }

    @Step
    public List<String> getRoomFeaturesListed(){
        waitForElementVisible(ReservationPageMaps.ROOM_FEATURES);
        return driver.findElements(ReservationPageMaps.ROOM_FEATURES)
                .stream()
                .map(this::getSafeText)
                .collect(Collectors.toList());
    }

    @Step
    public void getValidRoomHrefs(){

    }
}
