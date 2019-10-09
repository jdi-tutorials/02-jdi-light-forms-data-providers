package jdisite;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Link;
import com.epam.jdi.light.ui.html.elements.common.Text;
import com.epam.jdi.light.ui.html.elements.common.Button;
import jdisite.pages.HomePage;
import jdisite.sections.LoginForm;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JDISite {
    public static HomePage homePage;

    public static LoginForm loginForm;

    @UI("img#user-icon") public static Link userIcon;
    @UI("#user-name") public static Text userName;
    @UI(".fa-sign-out") public static Button logout;

}
