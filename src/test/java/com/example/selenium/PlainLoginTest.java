package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PlainLoginTest extends BaseTest{

    @Test
    public void login() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().setSize(new Dimension(840, 1027));
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".fa")).click();
        assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Secure Area", "Login failed");
        driver.findElement(By.cssSelector(".icon-2x")).click();
        driver.close();
    }
}
