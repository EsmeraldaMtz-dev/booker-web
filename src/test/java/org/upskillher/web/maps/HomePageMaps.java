package org.upskillher.web.maps;

import org.openqa.selenium.By;

public class HomePageMaps {
    public static final By HEADER_ROOMS_LINK = By.cssSelector("a[href='/#rooms']");
    public static final By ROOMS_SECTION = By.id("rooms");
    public static final By HEADER_BOOKING_LINK = By.cssSelector("a[href='/#booking']");
    public static final By BOOKING_SECTION = By.id("rooms");
    public static final By HEADER_AMENITIES_LINK = By.cssSelector("a[href='/#amenities']");
    public static final By AMENITIES_SECTION = By.id("amenities");
    public static final By HEADER_LOCATION_LINK = By.cssSelector("a[href='/#location']");
    public static final By LOCATION_SECTION = By.id("location");
    public static final By HEADER_CONTACT_LINK = By.cssSelector("a[href='/#contact']");
    public static final By CONTACT_SECTION = By.id("contact");

    /*-------------------------------BOOKING SECTION------------------------------------------*/
    public static final By CHECK_AVAILABILITY_BTN = By.xpath("//button[text()='Check Availability']");
    public static final By CHECK_IN_DATE_INPUT = By.xpath("//div[preceding-sibling::label[@for='checkin']]/div/input");
    public static final By CHECK_OUT_DATE_INPUT = By.xpath("//div[preceding-sibling::label[@for='checkout']]/div/input");

    /*-------------------------------ROOMS SECTION------------------------------------------*/
    public static final By ROOM_BOOK_NOW_BTNS = By.xpath("//a[contains(@href, '/reservation/')]");
}
