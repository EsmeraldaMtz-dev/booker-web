package org.upskillher.web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.upskillher.web.base.BasePage;
import org.upskillher.web.maps.HomePageMaps;
import org.upskillher.web.utils.ProjectUtils;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    /*----- NAVBAR Test Steps ----------------------------------------------------------------------------------------*/
    @Step("Verificar que la sección {sectionName} es visible")
    public boolean isSectionDisplayedWhenNavarLinkClicked(By linkLocator, By sectionLocator, String sectionName){
        safeClick(linkLocator);
        WebElement roomsSection = driver.findElement(sectionLocator);
        String[] splitedUrl = ProjectUtils.safeSplit(driver.getCurrentUrl(), "#");
        return roomsSection.isDisplayed()
                && splitedUrl[1].equals(sectionName);
    }


    @Step("Click al boton CheckAvailability")
    public void clickcheckAvailabilityBtn(){
        safeClick(HomePageMaps.CHECK_AVAILABILITY_BTN);
    }



    @Step("Obtener las referencias de las habitaciones disponibles en la fecha actual(default)")
    public List<String> getRoomsWithDefaultAvailabilityDate(){
        return driver.findElements(HomePageMaps.ROOM_BOOK_NOW_BTNS)
                .stream()
                .map(webElement -> webElement.getAttribute("href"))
                .collect(Collectors.toList());
    }

    @Step("Abrir una habitacion")
    public void selectARoom(){
        driver.get(getRoomsWithDefaultAvailabilityDate().get(0));
    }
}
