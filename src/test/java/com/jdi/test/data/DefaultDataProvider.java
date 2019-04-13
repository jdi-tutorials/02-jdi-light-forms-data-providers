package com.jdi.test.data;

import jdisite.entities.User;

public class DefaultDataProvider {
    public static User ROMAN = new User().set(c -> {
        c.name = "Roman";
        c.password = "Jdi1234";}
    );
}
