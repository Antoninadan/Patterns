package ua.i.mail100.factorymethod.factory;

import ua.i.mail100.factorymethod.interfaces.Unit;

public class ChineseFactory extends UnitFactory {
    @Override
    Unit getUnit() {
        return new Unit() {
            @Override
            public String getName() {
                return "Chinese";
            }

            @Override
            public String getFace() {
                return "-_-";
            }

            @Override
            public String getWeapon() {
                return "=|---";
            }
        };
    }
}
