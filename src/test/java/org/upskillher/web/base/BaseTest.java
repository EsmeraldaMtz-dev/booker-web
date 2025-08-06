package org.upskillher.web.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    private static final Logger log = LoggerFactory.getLogger(BaseTest.class);
    public RequestSpecBuilder requestSpecBuilder;

    @BeforeMethod
    public void setUp(){
        log.info("Setting up WebDriver for browser");
        RestAssured.baseURI = "https://reqres.in/api";
        requestSpecBuilder= new RequestSpecBuilder();
        requestSpecBuilder.addHeader("x-api-key", "reqres-free-v1");
        requestSpecBuilder.addHeader("Content-Type", "application/json");

        RestAssured.requestSpecification = requestSpecBuilder.build();
    }
}