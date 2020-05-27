package ua.i.mail100.abstractfactory2.app;

import ua.i.mail100.abstractfactory2.factory.GUIFactory;
import ua.i.mail100.abstractfactory2.interfaces.Button;
import ua.i.mail100.abstractfactory2.interfaces.Checkbox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}