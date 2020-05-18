package ua.i.mail100.abstractfactory.model.humans;

import ua.i.mail100.abstractfactory.interfaces.Archer;

public class HumanArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Human Archer shoot!");
    }
}
