package ua.i.mail100.factorymethod;

import ua.i.mail100.factorymethod.factory.car.HondaFactory;
import ua.i.mail100.factorymethod.factory.car.ToyotaFactory;
import ua.i.mail100.factorymethod.model.Honda;
import ua.i.mail100.factorymethod.model.Toyota;

public class CarRunner {
    public static void main(String[] args) {
        ToyotaFactory toyotaFactory = new ToyotaFactory();
        HondaFactory hondaFactory = new HondaFactory();

        Honda honda = hondaFactory.createCar();
        honda.viewCar();

        Toyota toyota = toyotaFactory.createCar();
        toyota.viewCar();
    }
}
