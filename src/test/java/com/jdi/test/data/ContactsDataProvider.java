package com.jdi.test.data;

import jdisite.entities.ContactInfo1;
import jdisite.entities.ContactInfo2;

public class ContactsDataProvider {

    public static ContactInfo1 SIMPLE_CONTACT = new ContactInfo1().set(c -> {
        c.name = "Roman";
        c.lastName = "Iovlev";
        c.position = "ChiefQA";
        c.passportNumber = "4321";
        c.passportSeria = "123456";
        c.description = "JDI - awesome UI automation tool"; }
    );

    public static ContactInfo2 FULL_CONTACT = new ContactInfo2().set(c -> {
        c.name = "Roman";
        c.lastName = "Full Contact";
        c.position = "ChiefQA";
        c.passportNumber = "4321";
        c.passportSeria = "123456";
        c.description = "JDI - awesome UI automation tool";

        c.gender = "Female";
        c.religion = "Other";
        c.weather = "Sun, Snow";
        c.acceptConditions = "true";
        c.passport = "true";
        }
    );
}
