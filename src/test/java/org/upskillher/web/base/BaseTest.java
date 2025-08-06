package org.upskillher.web.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    private static final Logger log = LoggerFactory.getLogger(BaseTest.class);
    protected WebDriver driver;

    public RequestSpecBuilder requestSpecBuilder;

    @BeforeMethod
    public void setUp(){
        log.info("Setting up WebDriver for browser");
        driver = new ChromeDriver();
        RestAssured.baseURI = "https://automationintesting.online/";
        requestSpecBuilder= new RequestSpecBuilder();
        requestSpecBuilder.addHeader("x-api-key", "reqres-free-v1");
        requestSpecBuilder.addHeader("Content-Type", "application/json");

        RestAssured.requestSpecification = requestSpecBuilder.build();

    }

    @AfterMethod
    public void tearDown(){
        if (driver != null) {
            log.info("Closing WebDriver");
            driver.quit();
        }
    }
}