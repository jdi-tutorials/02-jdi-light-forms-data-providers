package jdisite;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.Link;
import com.epam.jdi.light.ui.html.common.Text;
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
