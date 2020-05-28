package ua.i.mail100.factorymethod2;

import ua.i.mail100.factorymethod2.factory.HondaFactory;
import ua.i.mail100.factorymethod2.factory.ToyotaFactory;
import ua.i.mail100.factorymethod2.model.Honda;
import ua.i.mail100.factorymethod2.model.Toyota;

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
