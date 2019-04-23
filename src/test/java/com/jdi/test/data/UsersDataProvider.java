package com.jdi.test.data;

import jdisite.entities.User;
import org.testng.annotations.DataProvider;

public class UsersDataProvider {

    public static User ROMAN = new User().set(c -> {
        c.name = "Roman";
        c.password = "Jdi1234";}
    );
    public static User NO_PASSWORD = new User().set(c -> c.name = "Roman");
    public static User NO_CREDENTIALS = new User().set(c -> {
        c.name = "";
        c.password = "";}
    );
    public static User WRONG_CREDENTIALS = new User().set(c -> {
        c.name = "Alex";
        c.password = "Password";}
    );

    @DataProvider(name = "failedUsers")
    public static Object[][] failedUsers() {
        return new User[][]{{NO_PASSWORD}, {NO_CREDENTIALS}, {WRONG_CREDENTIALS}};
    }
}
