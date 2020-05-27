package ua.i.mail100.abstractfactory2.model.button;

import ua.i.mail100.abstractfactory2.interfaces.Button;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}