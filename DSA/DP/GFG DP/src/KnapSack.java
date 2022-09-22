import java.util.Arrays;
import java.util.Scanner;

public class KnapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        for (int i = 0; i < n; i++) val[i] = sc.nextInt();
        for (int i = 0; i < n; i++) wt[i] = sc.nextInt();
        int W = sc.nextInt();
        System.out.println(knapSack(W, wt, val, n));
        int[][] dp = new int[n + 1][W + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println(knapSack(W, wt, val, n, dp));
    }

    //Recursive
    public static int knapSack(int W, int[] wt, int[] val, int n) {
        if (n == 0 || W == 0) return 0;
        if (wt[n - 1] > W) return knapSack(W, wt, val, n - 1);
        else return Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
    }

    //Recursive with memo
    public static int knapSack(int W, int[] wt, int[] val, int n, int[][] dp) {
        if (n == 0 || W == 0) return 0;
        if (dp[n][W] != -1) return dp[n][W];
        if (wt[n - 1] > W) return dp[n][W] = knapSack(W, wt, val, n - 1, dp);
        else
            return dp[n][W] = Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1, dp), knapSack(W, wt, val, n - 1, dp));
    }


    static int knapSackBottomUp(int W, int wt[], int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w) 
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }
}
