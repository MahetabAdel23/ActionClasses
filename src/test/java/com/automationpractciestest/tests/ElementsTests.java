package com.automationpractciestest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementsTests {
    @Test
    public void HoverTest()

    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.quit();
    }
}