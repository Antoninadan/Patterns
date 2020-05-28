package ua.i.mail100.factorymethod2.factory;

import ua.i.mail100.factorymethod2.model.Honda;

public class HondaFactory extends CarFactory {
    @Override
    public Honda createCar() {
        return new Honda();
    }
}
