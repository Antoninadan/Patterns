package ua.i.mail100.template2;

public class Runner  {
    public static void main(String[] args) {
        int size = 5;

        Figure square = new Square(size);
        Figure cross = new Сross(size);
        Figure line = new Line(size);
        Figure triangle = new Triangle(size);

        System.out.println("square:");
        square.draw();

        System.out.println("cross:");
        cross.draw();

        System.out.println("line");
        line.draw();

        System.out.println("trianle");
        triangle.draw();
    }
}
