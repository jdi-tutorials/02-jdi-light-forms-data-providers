package com.jdi;

import jdisite.JDISite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.logger.LogLevels.STEP;
import static com.epam.jdi.light.settings.WebSettings.logger;
import static com.epam.jdi.light.ui.html.PageFactory.initElements;
import static com.jdi.test.data.DefaultDataProvider.ROMAN;
import static jdisite.JDISite.homePage;
import static jdisite.JDISite.loginAs;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        logger.setLogLevel(STEP);
        initElements(JDISite.class);
        homePage.open();
        loginAs(ROMAN);
    }
    @AfterSuite(alwaysRun = true)
    static void teardown() {
        killAllSeleniumDrivers();
    }
}
