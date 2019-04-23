package com.jdi.tests;

import com.jdi.TestsInit;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static com.jdi.states.State.loggedIn;
import static com.jdi.test.data.ContactsDataProvider.FULL_CONTACT;
import static com.jdi.test.data.ContactsDataProvider.SIMPLE_CONTACT;
import static jdisite.JDISite.contactPage;
import static jdisite.JDISite.sideMenu;
import static jdisite.enums.MenuOptions.ContactForm;
import static jdisite.pages.ContactPage.contactForm;
import static jdisite.pages.ContactPage.contactForm1;
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
        contactForm.submit(FULL_CONTACT);
        contactForm.check(FULL_CONTACT);
    }
    @Test
    public void failCheckExample() {
        sideMenu.select(ContactForm);
        contactPage.checkOpened();
        contactForm.fill(FULL_CONTACT);
        contactForm.acceptConditions.uncheck();
        contactForm.submit();
        List<String> result = contactForm.verify(FULL_CONTACT);
        assertThat(result, Matchers.hasSize(1));
        assertThat(result, hasItem("Field 'acceptConditions' (Actual: 'false' <> Expected: 'true')"));
    }
}
