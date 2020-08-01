package ua.i.mail100.template2;

public class Square extends Figure {
    public Square(int size) {
        super(size);
    }

    @Override
    public int[][] getPoints() {
        int[][] result = new int[getSize()][getSize()];

        for (int i = 0; i < getSize(); i++)
            for (int j = 0; j < getSize(); j++)
                result[i][j] = 1;

        return result;
    }
}
