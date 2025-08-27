package org.upskillher.web.base;

import io.qameta.allure.Attachment;
import io.restassured.builder.RequestSpecBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    private static final Logger log = LoggerFactory.getLogger(BaseTest.class);

    protected static final String BASE_URL = "https://automationintesting.online/";
    protected WebDriver driver;

    public RequestSpecBuilder requestSpecBuilder;

    @BeforeMethod
    public void setUp(){
        log.info("Setting up WebDriver for browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        log.info("WebDriver setup completed");
    }

    @AfterMethod
    public void tearDown(){
        if (driver != null) {
            log.info("Closing WebDriver");
            driver.quit();
        }
    }

    protected void navigateToHomePage(){
        driver.get(BASE_URL);
    }
    protected void navigateToAdminPage(){
        driver.get(BASE_URL+"/admin");
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}