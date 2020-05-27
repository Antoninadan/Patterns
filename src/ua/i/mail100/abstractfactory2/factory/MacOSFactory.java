package ua.i.mail100.abstractfactory2.factory;

import ua.i.mail100.abstractfactory2.interfaces.Button;
import ua.i.mail100.abstractfactory2.interfaces.Checkbox;
import ua.i.mail100.abstractfactory2.model.button.MacOSButton;
import ua.i.mail100.abstractfactory2.model.checkbox.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}