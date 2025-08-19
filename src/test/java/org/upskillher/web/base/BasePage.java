package org.upskillher.web.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    }

    //Wait for Element to be available to click
    protected WebElement waitForElementClickable(By locator){
        log.debug("Waiting for element to be clickable: '{}'", locator);
        return wait.until(ExpectedConditions.elementToBeClickable(locator)); //Aqui marca el error
    }

    //Ensure clickable element is safe to click
    protected void safeClick(By locator) {
        waitForElementClickable(locator).click();
        log.debug("Clicked on element: '{}'", locator);
    }

    protected String getSafeText(By locator){
        String safeText = wait.until(ExpectedConditions.visibilityOf(locator.findElement())).getText();
        log.debug("Getting text from '{}'", locator);
        return safeText;
    }

}
