package ua.i.mail100.abstractfactory.factory;

import ua.i.mail100.abstractfactory.interfaces.Archer;
import ua.i.mail100.abstractfactory.interfaces.Mage;
import ua.i.mail100.abstractfactory.interfaces.Warrior;
import ua.i.mail100.abstractfactory.model.humans.HumanArcher;
import ua.i.mail100.abstractfactory.model.humans.HumanMage;
import ua.i.mail100.abstractfactory.model.humans.HumanWarrior;

public class HumanSquadronFactory extends SquadronFactory {
    public Mage createMage() {
        return new HumanMage();
    }

    public Archer createArcher() {
        return new HumanArcher();
    }

    public Warrior createWarrior() {
        return new HumanWarrior();
    }
}