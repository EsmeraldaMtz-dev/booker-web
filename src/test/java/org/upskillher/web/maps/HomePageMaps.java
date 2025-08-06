package org.upskillher.web.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageMaps {
    @FindBy(css="a[href*='#/rooms']")
    public WebElement headerRoomsLink;
}
