package ua.i.mail100.abstractfactory.factory;

import ua.i.mail100.abstractfactory.interfaces.Archer;
import ua.i.mail100.abstractfactory.interfaces.Mage;
import ua.i.mail100.abstractfactory.interfaces.Warrior;
import ua.i.mail100.abstractfactory.model.elfs.ElfArcher;
import ua.i.mail100.abstractfactory.model.elfs.ElfMage;
import ua.i.mail100.abstractfactory.model.elfs.ElfWarrior;

public class ElfSquadronFactory extends SquadronFactory {
    public Mage createMage() {
        return new ElfMage();
    }

    public Archer createArcher() {
        return new ElfArcher();
    }

    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}