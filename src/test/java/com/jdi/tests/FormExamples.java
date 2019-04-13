package com.jdi.tests;

import com.jdi.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedOut;
import static com.jdi.test.data.DefaultDataProvider.ROMAN;
import static jdisite.JDISite.*;

public class FormExamples implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedOut();
        if (loginForm.isHidden())
            userIcon.click();
    }

    @Test
    public void contactFormTest() {
        loginForm.loginAs(ROMAN);
        userName.is().displayed();
    }
    @Test
    public void smartLoginTest() {
        loginFormSmart.loginAs(ROMAN);
        userName.is().displayed();
    }
}
