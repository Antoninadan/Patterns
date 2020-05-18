package ua.i.mail100.factorymethod.factory.car;

import ua.i.mail100.factorymethod.model.JapanCar;
import ua.i.mail100.factorymethod.model.Toyota;

public class ToyotaFactory extends CarFactory {
    public JapanCar createCar(){
        return new Toyota();
    }

}