package ua.i.mail100.factorymethod.factory.unit;

import ua.i.mail100.factorymethod.interfaces.Unit;

public class AmericanFactory extends UnitFactory {
    @Override
    Unit getUnit() {
        return new Unit() {
            @Override
            public String getName() {
                return "American";
            }

            @Override
            public String getFace() {
                return "~+_+~";
            }

            @Override
            public String getWeapon() {
                return "=-->";
            }
        };
    }
}
