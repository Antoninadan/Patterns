package ua.i.mail100.factorymethod2.model;

public class Honda extends JapanCar {
    public Honda(){
        name = "Honda";
    }

    @Override
    public void viewCar() {
        System.out.println("Honda");
    }
}
