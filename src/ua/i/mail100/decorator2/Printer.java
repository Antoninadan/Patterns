package ua.i.mail100.decorator2;

public class Printer implements WrappeeInterface {
    private String text;

    public Printer(String text) {
        this.text = text;
    }

    public Printer() {
    }

    @Override
    public String toPrint(String data) {
        return text;
    }

    @Override
    public void print(String data) {
        System.out.println(data);
    }
}
