package com.example.selenium;

import com.example.selenium.steps.UserSteps;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;
    private Object UserSteps;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/anton.zhdanov/github-demo/java-basics-hw14-selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().setSize(new Dimension(1792, 1027));
        UserSteps = new UserSteps(driver);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
