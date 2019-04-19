package jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import jdisite.sections.ContactForm1;
import jdisite.sections.ContactForm2;

@Url("/contacts") @Title("Contact Form")
public class ContactPage extends WebPage {
    @UI("#contact-form") public static ContactForm1 contactForm1;
    @UI("#contact-form") public static ContactForm2 contactForm2;
}
