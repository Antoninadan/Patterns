package ua.i.mail100.template2;

public class Сross extends Figure {
    public Сross(int size) {
        super(size);
    }

    @Override
    public int[][] getPoints() {
        int size = getSize();
        int[][] result = new int[size][size];
        int k;

        if (size % 2 == 1) {
            k = size / 2;
        } else {
            k = size / 2 - 1;
        }

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (((j <= k - 1) || (j >= size - k))
                        && ((i <= k - 1) || (i >= size - k))) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = 1;
                }
        return result;
    }
}
