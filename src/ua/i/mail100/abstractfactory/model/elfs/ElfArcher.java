package ua.i.mail100.abstractfactory.model.elfs;

import ua.i.mail100.abstractfactory.interfaces.Archer;

public class ElfArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Elf Archer shoot!");
    }
}
