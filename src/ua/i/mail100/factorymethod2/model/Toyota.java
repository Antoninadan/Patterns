package ua.i.mail100.factorymethod2.model;

public class Toyota extends JapanCar {
    public Toyota() {
        name = "Toyota";
    }

    @Override
    public void viewCar() {
        System.out.println("Toyota");
    }
}
