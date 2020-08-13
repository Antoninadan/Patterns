package ua.i.mail100.decorator3;

public interface Printable {
    void print();
}

// *-Hello-*

class RealPrinter implements Printable {
    private String text;

    public RealPrinter(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}

class Star implements Printable {

    private Printable printable;

    public Star(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("*");
        printable.print();
    }
}

class Devis implements Printable {

    private Printable printable;

    public Devis(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("-");
        printable.print();
    }
}

class TestDecorator {
    public static void main(String[] args) {
        Printable printer = new RealPrinter("Hello");

        Printable firstDevis = new Devis(printer);//*

        Printable firstStar = new Star(firstDevis);//*Hello

        firstStar.print();


    }
}

