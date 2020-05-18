package ua.i.mail100.abstractfactory.model.elfs;

import ua.i.mail100.abstractfactory.interfaces.Warrior;

public class ElfWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Elf Warrior attack!");
    }
}
