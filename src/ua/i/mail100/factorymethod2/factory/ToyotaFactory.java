package ua.i.mail100.factorymethod2.factory;

import ua.i.mail100.factorymethod2.model.Toyota;

public class ToyotaFactory extends CarFactory {
    @Override
    public Toyota createCar() {
        return new Toyota();
    }
}