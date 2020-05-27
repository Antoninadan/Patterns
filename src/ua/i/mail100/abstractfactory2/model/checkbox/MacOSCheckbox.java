package ua.i.mail100.abstractfactory2.model.checkbox;

import ua.i.mail100.abstractfactory2.interfaces.Checkbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}