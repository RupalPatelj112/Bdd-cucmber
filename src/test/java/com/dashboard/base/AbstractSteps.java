package com.dashboard.base;

import com.dashboard.utils.ConfigUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AbstractSteps {

    public static WebDriver driver;
    private String WEB_DRIVER = "webdriver.chrome.driver";

    public WebDriver openDriver()
    {
        System.setProperty(WEB_DRIVER, ConfigUtils.getDriverPath());
        System.out.println("Landed in to a page");

        driver = new ChromeDriver();
        return driver;
    }

    public void maximumBrowser()
    {
        driver.manage().window().maximize();
    }

    public void navigateToUrl()
    {
        driver.get(ConfigUtils.getBaseUrl());
    }

    public void applyImpwait()
    {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public void closeBrowser()
    {
        driver.close();
    }

}
