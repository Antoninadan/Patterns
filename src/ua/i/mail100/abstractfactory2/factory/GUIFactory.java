package ua.i.mail100.abstractfactory2.factory;

import ua.i.mail100.abstractfactory2.interfaces.Button;
import ua.i.mail100.abstractfactory2.interfaces.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
