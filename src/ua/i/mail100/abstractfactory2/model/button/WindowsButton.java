package ua.i.mail100.abstractfactory2.model.button;

import ua.i.mail100.abstractfactory2.interfaces.Button;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}