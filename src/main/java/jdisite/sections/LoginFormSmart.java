package jdisite.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.TextField;
import jdisite.entities.User;

public class LoginFormSmart extends Form<User> {
    TextField name, password;
    Button loginButton;
}
