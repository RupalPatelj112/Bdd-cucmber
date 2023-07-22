package com.dashboard.utils;

public class ConfigUtils {
    private static String BASE_URL = "https://www.mwiah.co.uk/";
    private static final String DRIVER_PATH = "/Users/rupalpatel/Documents/workspace/selenium-web-mwi/src/test/resources/driver/chromedriver" ;
    public static String getDriverPath() {
        return DRIVER_PATH;
    }

    public static String getBaseUrl()
    {
        return BASE_URL;
    }


}
