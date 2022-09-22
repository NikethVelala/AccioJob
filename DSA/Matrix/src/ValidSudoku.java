//https://leetcode.com/problems/valid-sudoku/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] a = new char[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                a[i][j] = sc.next().charAt(0);
        System.out.println(validSudoku(a));
    }

    private static boolean validSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] != '0') {
                    String b = "(" + board[i][j] + ")";
                    if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i / 3 + b + j / 3))
                        return false;
                }
            }
        }
        return true;
    }
}
