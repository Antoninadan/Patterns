package ua.i.mail100.abstractfactory.model.elfs;

import ua.i.mail100.abstractfactory.interfaces.Mage;

public class ElfMage implements Mage {
    @Override
    public void cast() {
        System.out.println("Elf Mage cast!");
    }
}
