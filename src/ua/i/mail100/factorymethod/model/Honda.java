package ua.i.mail100.factorymethod.model;

public class Honda extends JapanCar {
    public Honda(){
        name = "Honda";
    }

    @Override
    public void viewCar() {
        System.out.println("Honda");
    }
}
