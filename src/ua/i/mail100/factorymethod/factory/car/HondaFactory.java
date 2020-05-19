package ua.i.mail100.factorymethod.factory.car;

import ua.i.mail100.factorymethod.model.Honda;

public class HondaFactory extends CarFactory {
    @Override
    public Honda createCar() {
        return new Honda();
    }
}
