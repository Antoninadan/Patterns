package ua.i.mail100.template2;

public class Runner  {
    public static void main(String[] args) {
        int size = 5;

        Figure square = new Square(size);
        Figure cross = new Сross(size);
        Figure line = new Line(size);
        Figure triangle = new Triangle(size);

        System.out.println("square:");
        square.drow();

        System.out.println("cross:");
        cross.drow();

        System.out.println("line");
        line.drow();

        System.out.println("trianle");
        triangle.drow();
    }
}
