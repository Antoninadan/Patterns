package ua.i.mail100.abstractfactory.model;

import ua.i.mail100.abstractfactory.factory.SquadronFactory;
import ua.i.mail100.abstractfactory.interfaces.Archer;
import ua.i.mail100.abstractfactory.interfaces.Mage;
import ua.i.mail100.abstractfactory.interfaces.Warrior;

public class Squadron {
    public void createSquadron (SquadronFactory factory) {
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();

        mage.cast();
        archer.shoot();
        warrior.attack();
    }
}
