package ua.i.mail100.template3;

public abstract class Painter {

    private void printTree() {
        System.out.println("         *\n" +
                "         ***\n" +
                "        *****\n" +
                "       *******\n" +
                "      *********");
    }

    protected abstract void draw();

    public final void print() {
        printTree();
        draw();
        printTree();
    }
}

class DrawLine extends Painter {
    @Override
    public void draw() {
        System.out.println("************");
    }
}

class DrawSquare extends Painter {
    @Override
    public void draw() {
        System.out.println("" +
                "\n************" +
                "\n************" +
                "\n************" +
                "\n************" +
                "\n************" +
                "");
    }
}

class TestTemplateMethod {
    public static void main(String[] args) {
        new DrawLine().print();
    }
}
