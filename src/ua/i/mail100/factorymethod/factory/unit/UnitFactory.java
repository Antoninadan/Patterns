package ua.i.mail100.factorymethod.factory.unit;

import ua.i.mail100.factorymethod.interfaces.Unit;

public abstract class UnitFactory {

    public void displayUnit(){
        Unit unit = getUnit();
        System.out.println("Name: "+unit.getName());
        System.out.println(unit.getFace());
        System.out.println("/|\\"+unit.getWeapon());
        System.out.println("/ \\");
    }

    abstract Unit getUnit();
}
