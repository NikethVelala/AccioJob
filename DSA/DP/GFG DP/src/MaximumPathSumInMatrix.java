import java.util.Scanner;

public class MaximumPathSumInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();
        System.out.println(maximumPathSumInMatrix(matrix, r, c));
    }

    public static int maximumPathSumInMatrix(int[][] matrix, int r1, int c1) {
        int max = 0;
        if (matrix.length == 1)
            for (int i = 0; i < matrix[0].length; i++)
                max = Math.max(max, matrix[0][i]);

        for (int r = 1; r < r1; r++)
            for (int c = 0; c < c1; c++) {
                if (c == 0)
                    matrix[r][c] = matrix[r][c] + Math.max(matrix[r - 1][c], matrix[r - 1][c + 1]);
                else if (c == c1 - 1)
                    matrix[r][c] = matrix[r][c] + Math.max(matrix[r - 1][c - 1], matrix[r - 1][c]);
                else
                    matrix[r][c] = matrix[r][c] + Math.max(Math.max(matrix[r - 1][c - 1], matrix[r - 1][c]), matrix[r - 1][c + 1]);
            }

        for (int i = 0; i < c1; i++)
            max = Math.max(max, matrix[r1 - 1][i]);
        return max;
    }
}
