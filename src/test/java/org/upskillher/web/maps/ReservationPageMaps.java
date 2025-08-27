package org.upskillher.web.maps;

import org.openqa.selenium.By;

public class ReservationPageMaps {
    public static final By ROOM_FEATURES = By.xpath("//h2[text()='Room Features']/following-sibling::div//span");

    public static final By START_DATE = By.xpath("//div[@class='rbc-date-cell']/button[text()='01']");
    public static final By END_DATE = By.xpath("//div[@class='rbc-date-cell']/button[text()='28']");
    public static final By RESERVE_BTN = By.id("doReservation");


    /*--------------------------------------------CLIENT INFO FORM ---------------------------------------------------*/
    public static final By FIRSTNAME_INPUT = By.xpath("//input[@placeholder='Firstname']");
    public static final By LASTNAME_INPUT = By.xpath("//input[@placeholder='Lastname']");
    public static final By EMAIL_INPUT = By.xpath("//input[@placeholder='Email']");
    public static final By PHONE_INPUT = By.xpath("//input[@placeholder='Phone']");
}
