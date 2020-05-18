package ua.i.mail100.abstractfactory.model.humans;

import ua.i.mail100.abstractfactory.interfaces.Mage;

public class HumanMage implements Mage {
    @Override
    public void cast() {
        System.out.println("Human Mage cast!");
    }
}
