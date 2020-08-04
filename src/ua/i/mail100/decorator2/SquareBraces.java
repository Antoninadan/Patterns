package ua.i.mail100.decorator2;

public class SquareBraces extends BaseDecorator{

    public SquareBraces(WrappeeInterface wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String data) {
        super.print(decorateBraces(data));
    }

    private String decorateBraces(String text){
        return "[" + text + "]";
    }
}
