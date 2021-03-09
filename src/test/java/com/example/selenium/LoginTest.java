package com.example.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    private static final String LOGIN = "tomsmith";
    private static final String PASSWORD = "SuperSecretPassword!";

    @Test
    public void login() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }

}
