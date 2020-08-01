package ua.i.mail100.template2;

import java.util.Arrays;

public class Line extends Figure {
    public Line(int size) {
        super(size);
    }

    @Override
    public int[][] getPoints() {
        int[][] result = new int[1][getSize()];

        for (int i = 0; i < getSize(); i++)
                result[0][i] = 1;

        return result;
    }
}
