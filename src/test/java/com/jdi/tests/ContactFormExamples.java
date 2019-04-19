package com.jdi.tests;

import com.jdi.TestsInit;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static com.jdi.states.State.loggedIn;
import static com.jdi.test.data.DefaultDataProvider.FULL_CONTACT;
import static com.jdi.test.data.DefaultDataProvider.SIMPLE_CONTACT;
import static jdisite.JDISite.contactPage;
import static jdisite.JDISite.sideMenu;
import static jdisite.enums.MenuOptions.ContactForm;
import static jdisite.pages.ContactPage.contactForm1;
import static jdisite.pages.ContactPage.contactForm2;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class ContactFormExamples implements TestsInit {
    @BeforeMethod
    public void before() {
        loggedIn();
    }
    @Test
    public void simpleContactFormTest() {
        sideMenu.select("Contact form");
        contactPage.checkOpened();
        contactForm1.submit(SIMPLE_CONTACT);
        contactForm1.check(SIMPLE_CONTACT);
    }
    @Test
    public void fullContactFormTest() {
        sideMenu.select(ContactForm);
        contactPage.checkOpened();
        contactForm2.submit(FULL_CONTACT);
        contactForm2.check(FULL_CONTACT);
    }
    @Test
    public void failCheckExample() {
        sideMenu.select(ContactForm);
        contactPage.checkOpened();
        contactForm2.fill(FULL_CONTACT);
        contactForm2.acceptConditions.uncheck();
        contactForm2.submit();
        List<String> result = contactForm2.verify(FULL_CONTACT);
        assertThat(result, Matchers.hasSize(1));
        assertThat(result, hasItem("Field 'acceptConditions' (Actual: 'false' <> Expected: 'true')"));
    }
}
