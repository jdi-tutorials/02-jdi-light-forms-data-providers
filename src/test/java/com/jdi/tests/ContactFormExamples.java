package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.Test;

import static com.jdi.test.data.DefaultDataProvider.ROMAN;
import static jdisite.JDISite.*;

public class ContactFormExamples implements TestsInit {
    @Test
    public void contactFormTest() {
        sideMenu.select("Contact form");
        contactPage.checkOpened();

    }
    @Test
    public void smartLoginTest() {
        loginFormSmart.loginAs(ROMAN);
        userName.is().displayed();
    }
}
