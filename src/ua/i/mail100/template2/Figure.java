package ua.i.mail100.template2;

public abstract class Figure {
    private int size;

    public Figure(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public abstract int[][] getPoints();

    public final void draw() {
        int[][] points = getPoints();
        int pointSizeX = points.length;
        int pointSizeY = points[0].length;

        for (int i = 0; i < pointSizeX; i++) {
            for (int j = 0; j < pointSizeY; j++) {
                if (points[i][j] != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
