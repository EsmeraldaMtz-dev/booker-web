package org.upskillher.web.maps;

import org.openqa.selenium.By;

public class AdminPageMaps {
    /*--------------------------------------------------LOGIN----------------------------------------------------------*/
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BTN = By.id("doLogin");

    public static final By LOGOUT_BTN = By.xpath("//button[text()='Logout']");

    /*----------------------------------------------ADMIN ROOMS--------------------------------------------------------*/
    public static final By ROOM_NUM = By.id("roomName");
    public static final By ROOM_TYPE_SELECT = By.id("type");
    public static final By ROOM_ACCESS_SELECT = By.id("accessible");
    public static final By ROOM_PRICE_INPUT = By.id("roomPrice");
    public static final By ROOM_FEATURE_CHECKBOXES = By.xpath("//input[@name='featureCheck']");

}
