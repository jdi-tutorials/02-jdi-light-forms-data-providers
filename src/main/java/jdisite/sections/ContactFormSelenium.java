package jdisite.sections;

import com.epam.jdi.light.elements.complex.Selector;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import com.epam.jdi.light.ui.html.common.Checkbox;
import com.epam.jdi.light.ui.html.common.TextField;
import jdisite.entities.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormSelenium extends Form<User> {
    @FindBy(css = "#passport") public WebElement passport;
    @FindBy(css = "#name") public WebElement name;
    @FindBy(css = "#last-name") public WebElement lastName;
    @FindBy(css = "#position") public WebElement position;
    @FindBy(css = "#passport-number") public WebElement passportNumber;
    @FindBy(css = "#passport-seria") public WebElement passportSeria;

    @FindBy(css = "#gender") public Selector gender;
    @FindBy(css = "div[ui=combobox] input") public WebElement religion;

    @FindBy(css = "#accept-conditions") public WebElement acceptConditions;
    @FindBy(css = "textarea") public WebElement description;

    @FindBy(xpath = ".//button[@type='submit']") public WebElement submit;
}
