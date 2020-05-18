package ua.i.mail100.abstractfactory.model.humans;

import ua.i.mail100.abstractfactory.interfaces.Warrior;

public class HumanWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Human Warrior attack!");
    }
}
