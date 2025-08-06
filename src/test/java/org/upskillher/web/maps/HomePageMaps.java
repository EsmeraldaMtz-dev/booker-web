package org.upskillher.web.maps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMaps {
    @FindBy(css="a[href*='#/rooms']")
    public WebElement headerRoomsLink;

    @FindBy(id="rooms")
    public WebElement roomsSection;

}
