package ua.i.mail100.factorymethod.factory.car;

import ua.i.mail100.factorymethod.model.Toyota;

public class ToyotaFactory extends CarFactory {
    @Override
    public Toyota createCar() {
        return new Toyota();
    }
}