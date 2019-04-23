package com.jdi.tests;

import com.jdi.TestsInit;
import com.jdi.test.data.UsersDataProvider;
import jdisite.entities.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.jdi.states.State.loggedOut;
import static com.jdi.states.State.loginFormShown;
import static com.jdi.test.data.UsersDataProvider.*;
import static jdisite.JDISite.loginForm;
import static jdisite.JDISite.userName;


public class LoginExample implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedOut();
        loginFormShown();
    }

    @Test
    public void loginTest() {
        loginForm.loginAs(ROMAN);
        userName.is().displayed();
    }
    @Test
    public void failedLoginTest1() {
        loginForm.loginAs(NO_PASSWORD);
        userName.is().hidden();
    }
    @Test
    public void failedLoginTest2() {
        loginForm.loginAs(WRONG_CREDENTIALS);
        userName.is().hidden();
    }
    @Test
    public void failedLoginTest3() {
        loginForm.loginAs(NO_CREDENTIALS);
        userName.is().hidden();
    }

    @Test(dataProvider = "failedUsers", dataProviderClass = UsersDataProvider.class)
    public void dataFailedLoginTest(User user) {
        loginForm.loginAs(user);
        userName.is().hidden();
    }
}
