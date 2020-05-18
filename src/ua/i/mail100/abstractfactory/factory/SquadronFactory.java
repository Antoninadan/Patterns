package ua.i.mail100.abstractfactory.factory;

import ua.i.mail100.abstractfactory.interfaces.Archer;
import ua.i.mail100.abstractfactory.interfaces.Mage;
import ua.i.mail100.abstractfactory.interfaces.Warrior;

public abstract class SquadronFactory {
    public abstract Mage createMage();

    public abstract Archer createArcher();

    public abstract Warrior createWarrior();
}