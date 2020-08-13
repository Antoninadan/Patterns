package ua.i.mail100.decorator2;

// ConcreteComponent
public class Printer implements WrappeeInterface {
    @Override
    public void print(String data) {
        System.out.println(data +3);
    }
}
