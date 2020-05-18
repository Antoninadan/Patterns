package ua.i.mail100.factorymethod;

import ua.i.mail100.factorymethod.factory.unit.AmericanFactory;
import ua.i.mail100.factorymethod.factory.unit.ChineseFactory;

public class UnitRunner {
    public static void main(String[] args){
        ChineseFactory chineseFactory = new ChineseFactory();
        chineseFactory.displayUnit();

        AmericanFactory americanFactory = new AmericanFactory();
        americanFactory.displayUnit();
    }
}
