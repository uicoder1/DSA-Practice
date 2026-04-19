import java.util.*;

public class reshapematrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            result[i / c][i % c] = mat[i / n][i % n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int[][] res = matrixReshape(mat, 1, 4);

        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}