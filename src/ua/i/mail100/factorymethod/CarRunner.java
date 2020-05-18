package ua.i.mail100.factorymethod;

import ua.i.mail100.factorymethod.factory.car.HondaFactory;
import ua.i.mail100.factorymethod.factory.car.CarFactory;
import ua.i.mail100.factorymethod.factory.car.ToyotaFactory;
import ua.i.mail100.factorymethod.model.JapanCar;

public class CarRunner {
    public static void main(String[] args) {
        CarFactory toyotaFactory = new ToyotaFactory();
        CarFactory hondaFactory = new HondaFactory();

        JapanCar myToyota = toyotaFactory.createCar();
        JapanCar myHonda = hondaFactory.createCar();

        myToyota.viewCar();
        myHonda.viewCar();
    }
}
