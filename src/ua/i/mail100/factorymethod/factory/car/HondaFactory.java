package ua.i.mail100.factorymethod.factory.car;

import ua.i.mail100.factorymethod.model.Honda;
import ua.i.mail100.factorymethod.model.JapanCar;

public class HondaFactory extends CarFactory {
    public JapanCar createCar(){
        return new Honda();
    }
}
