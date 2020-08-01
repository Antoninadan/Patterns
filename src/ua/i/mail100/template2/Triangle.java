package ua.i.mail100.template2;

public class Triangle extends Figure {
    public Triangle(int size) {
        super(size);
    }

    @Override
    public int[][] getPoints() {
        int sizeX = getSize();
        int sizeY = 2 * getSize() - 1;
        int center = sizeX - 1;
        int[][] result = new int[sizeX][sizeY];

        for (int i = 0; i < sizeX; i++)
            for (int j = 0; j < sizeY; j++)
                if ((center - i <= j && j <= center + i)) result[i][j] = 1;
        return result;
    }
}
