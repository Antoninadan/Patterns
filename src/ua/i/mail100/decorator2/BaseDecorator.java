package ua.i.mail100.decorator2;

public class BaseDecorator implements WrappeeInterface {
    private WrappeeInterface wrappee;

    public BaseDecorator(WrappeeInterface wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void print(String data) {
        wrappee.print(data);
    }


}
