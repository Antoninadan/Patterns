package ua.i.mail100.decorator2;

// ConcreteDecorator
public class SlashBraces extends BaseDecorator{

    public SlashBraces(WrappeeInterface wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String data) {
        super.print(decorateBraces(data));
    }

    private String decorateBraces(String text){
        return "/" + text + "/";
    }
}
