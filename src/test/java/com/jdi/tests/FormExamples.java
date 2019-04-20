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
    }
    @Test
    public void loginTest() {
        userIcon.click();
        loginForm.loginAs(ROMAN);
        userName.is().displayed();
    }
}
