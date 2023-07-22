package com.dashboard;

import com.dashboard.base.AbstractSteps;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private AbstractSteps driverHelper = new AbstractSteps();

    @Before
    public void setUp()
    {
        driverHelper.openDriver();
        driverHelper.navigateToUrl();
        driverHelper.maximumBrowser();
        driverHelper.applyImpwait();
    }

    @After
    public void tearDown()
    {
        driverHelper.closeBrowser();
    }
}
