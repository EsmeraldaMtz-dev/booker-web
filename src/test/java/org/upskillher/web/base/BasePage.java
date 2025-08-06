package org.upskillher.web.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public abstract class BasePage {
    private static final Logger log = LoggerFactory.getLogger(BasePage.class);

    protected WebDriverWait wait;
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    //Wait for Element to be available to click
    protected WebElement waitForElementClickable(WebElement element){
        log.debug("Waiting for element to be clickable: {}", element);
        return wait.until(ExpectedConditions.elementToBeClickable(element)); //Aqui marca el error
    }

    //Ensure clickable element is safe to click
    protected void safeClick(WebElement element) {
        waitForElementClickable(element).click();
        log.debug("Clicked on element: {}", element.getTagName());
    }

}
