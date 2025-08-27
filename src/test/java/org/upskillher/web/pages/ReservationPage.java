package org.upskillher.web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.upskillher.web.base.BasePage;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.maps.ReservationPageMaps;

import java.util.List;
import java.util.stream.Collectors;

public class ReservationPage extends BasePage {

    Actions actions = new Actions(driver);

    public ReservationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click Button")
    public void accessReservationByBookNowBtn(WebElement bookNowBtn){
        safeClick(bookNowBtn);
    }

    @Step("Obtener los features de la habitación")
    public List<String> getRoomFeaturesListed(){
        waitForElementVisible(ReservationPageMaps.ROOM_FEATURES);
        return driver.findElements(ReservationPageMaps.ROOM_FEATURES)
                .stream()
                .map(this::getSafeText)
                .collect(Collectors.toList());
    }

    @Step("Establecer fechas en la habitación seleccionada y reservar")
    public void setCheckInCheckOutDatesAndReserve(){
        WebElement startDate = driver.findElement(ReservationPageMaps.START_DATE);
        WebElement endDate   = driver.findElement(ReservationPageMaps.END_DATE);
        actions.clickAndHold(startDate)
                .moveToElement(endDate)
                .release()
                .build()
                .perform();

        safeClick(ReservationPageMaps.RESERVE_BTN);

    }

    @Step("Llenar formulario de Datos de cliente")
    public void fillCustomerData(){
        setSafeText(ReservationPageMaps.FIRSTNAME_INPUT, "Joe");
    }
}
